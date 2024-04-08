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

%state DoubleStringLiteral

WHITE_SPACE      = [\s\t]
COMMENT_LINE     = [/]{2}[^\r\n]*
COMMENT_BLOCK    = [/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
STRING_LINE      = #[|][^\r\n]*
//SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
VERSION = ([0-9]+)(\.[0-9]+)(\.[0-9]+)(-[a-zA-Z0-9\-]+)?
ESCAPED = %[a-zA-Z0-9\-]+
SYMBOL = [_\p{XID_START}][\p{XID_CONTINUE}]*
WORD = [a-zA-Z][a-zA-Z0-9]*
//STRING=\"([^\"\\]|\\.)*\"
INTEGER=(0|[1-9][0-9_]*)[L]?
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


KW_TRAIT    = "trait"
KW_STRUCT  = "struct"

KW_PUBLIC  = "pub"
KW_PRIVATE = "priv"
KW_MUTABLE = "mut"
KW_LET     = "let"
KW_FN      = "fn"

%%

<YYINITIAL> {
    {WHITE_SPACE}+     { return WHITE_SPACE; }
	{COMMENT_LINE}     { return COMMENT_LINE; }
	{COMMENT_BLOCK}    { return COMMENT_BLOCK; }
    {STRING_LINE}      { return STRING_LINE; }
}

<YYINITIAL> {
	"(" { return PARENTHESIS_L; }
    ")" { return PARENTHESIS_R; }
    "[" { return BRACKET_L; }
    "]" { return BRACKET_R; }
	"{" { return BRACE_L; }
	"}" { return BRACE_R; }
	"^" { return ACCENT; }
	"::" { return NAME_JOIN; }
	":" { return COLON; }
	";" { return SEMICOLON; }
	"$" { return DOLLAR; }
	"@" { return AT; }
	"." { return DOT; }
	"," { return COMMA; }

	"+=" { return OP_ADD_ASSIGN; }
	"+" { return OP_ADD; }
	"*" { return OP_MUL; }
	"/=" { return OP_DIV_ASSIGN; }
	"/" { return OP_DIV; }
	"%" { return OP_MOD; }
	"->" { return OP_TO; }


	"<=" { return OP_LEQ; }
	"<" { return OP_LT; }
	">" { return OP_GT; }
	">=" { return OP_GEQ; }

	"||" { return OP_OR; }
	"|>" { return OP_THEN; }
	"&&" { return OP_AND; }

	"!=" { return OP_NE; }
	"==" { return OP_EQ; }
	"=>" { return OP_PATTERN_TO; }
	"=" { return OP_ASSIGN; }
	"!" { return OP_ERROR; }

	"~" { return OP_REF; }

	"?" { return OP_THROW; }

	"-" { return OP_SUB; }
}
<YYINITIAL> {
	{KW_TYPE}    { return KW_TYPE; }

	{KW_STRUCT}  { return KW_STRUCT; }
	{KW_ENUM}    { return KW_ENUM; }

	{KW_TRAIT}   { return KW_TRAIT; }
    impl         { return KW_IMPLEMENT; }


	{KW_PUBLIC}  { return KW_PUBLIC; }
	{KW_PRIVATE} { return KW_PRIVATE; }

	{KW_MUTABLE} { return KW_MUTABLE; }

	{KW_LET}     { return KW_LET; }
	{KW_FN}      { return KW_FN; }
	test    { return KW_TEST; }

	if    { return KW_IF; }
	else  { return KW_ELSE; }

    match { return KW_MATCH; }

	while { return KW_WHILE; }
    for  { return KW_FOR; }

	break { return KW_BREAK; }
	continue { return KW_CONTINUE; }
	return { return KW_RETURN; }
}
<YYINITIAL> {
	{SYMBOL}  { return SYMBOL; }
	{INTEGER} { return INTEGER; }
}

<YYINITIAL> {
	"\""  {
	          yybegin(DoubleStringLiteral);
	          return DOUBLE_QUOTE_L;
	}
}
<DoubleStringLiteral> {
	"\""  {
	          yybegin(YYINITIAL);
	          return DOUBLE_QUOTE_R;
	}
	[^] { return STRING_TEXT; }
}
// =====================================================================================================================
[^] { return BAD_CHARACTER; }
