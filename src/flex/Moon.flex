package com.github.moonbit;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.moonbit.psi.MoonTypes.*;

%%
%public
%class _MoonLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%state StringInterpolation

WHITE_SPACE      = [\s\t]
COMMENT_LINE     = [/]{2}[^\r\n]*
COMMENT_BLOCK    = [/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
//SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
VERSION = ([0-9]+)(\.[0-9]+)(\.[0-9]+)(-[a-zA-Z0-9\-]+)?
ESCAPED = %[a-zA-Z0-9\-]+
SYMBOL = [_\p{XID_START}][\p{XID_CONTINUE}]+
WORD = [a-zA-Z][a-zA-Z0-9]*
//STRING=\"([^\"\\]|\\.)*\"
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([Ee][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)

HEX = [0-9a-fA-F]

KW_PACKAGE     = "package"
KW_WORLD       = "world"
KW_INTERFACE   = "interface"
KW_INCLUDE     = "include"
KW_EXPORT      = "export"
KW_IMPORT      = "import"
KW_USE         = "use"
KW_AS          = "as"
KW_TYPE        = "type"
KW_RESOURCE    = "resource"
KW_RECORD      = "record"
KW_ENUM        = "enum"
KW_FLAGS       = "flags"
KW_VARIANT     = "variant"
KW_CONSTRUCTOR = "constructor"

KW_PUBLIC  = "pub"
KW_PRIVATE = "priv"
KW_LET     = "let"
KW_FN      = "fn"


KW_TEST = "test"

KW_WHILE      = "while"

%%

<YYINITIAL> {
    {WHITE_SPACE}+     { return WHITE_SPACE; }
	{COMMENT_LINE}     { return COMMENT_LINE; }
	{COMMENT_BLOCK}    { return COMMENT_BLOCK; }
}

<YYINITIAL> {
	"(" { return PARENTHESIS_L; }
    ")" { return PARENTHESIS_R; }
    "[" { return BRACKET_L; }
    "]" { return BRACKET_R; }
	"{" { return BRACE_L; }
	"}" { return BRACE_R; }
	"<" { return ANGLE_L; }
	">" { return ANGLE_R; }
    "->" { return TO; }
	"^" { return ACCENT; }
	":" { return COLON; }
	";" { return SEMICOLON; }
	"$" { return DOLLAR; }
	"@" { return AT; }
	"/" { return SLASH; }
	"." { return DOT; }
	"," { return COMMA; }
	"-" { return HYPHEN; }
	"=" { return EQ; }
}
<YYINITIAL> {
	{KW_PACKAGE}   { return KW_PACKAGE; }
	{KW_WORLD}     { return KW_WORLD; }
	{KW_INTERFACE} { return KW_INTERFACE; }

	{KW_INCLUDE} { return KW_INCLUDE; }
	{KW_USE}     { return KW_USE; }
	{KW_AS}      { return KW_AS; }
	{KW_IMPORT}  { return KW_IMPORT; }
	{KW_EXPORT}  { return KW_EXPORT; }

	{KW_TYPE}     { return KW_TYPE; }
	{KW_RESOURCE} { return KW_RESOURCE; }
	{KW_RECORD}   { return KW_RECORD; }
	{KW_ENUM}     { return KW_ENUM; }
	{KW_FLAGS}    { return KW_FLAGS; }
	{KW_VARIANT}  { return KW_VARIANT; }

	{KW_LET}       { return KW_LET; }
	{KW_FN}        { return KW_FN; }
	{KW_PUBLIC}    { return KW_PUBLIC; }
      {KW_PRIVATE} { return KW_PRIVATE; }


    {KW_CONSTRUCTOR} { return KW_CONSTRUCTOR; }

      {KW_WHILE} { return KW_WHILE; }


      {KW_TEST} { return KW_TEST; }

	{VERSION} { return VERSION; }
    {ESCAPED} { return ESCAPED; }
	{SYMBOL}  { return SYMBOL; }
}
// =====================================================================================================================
[^] { return BAD_CHARACTER; }
