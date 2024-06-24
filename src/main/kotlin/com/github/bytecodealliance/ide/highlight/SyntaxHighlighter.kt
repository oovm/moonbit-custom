package com.github.bytecodealliance.ide.highlight


import com.github.moonbit.psi.MoonParserDefinition
import com.github.moonbit.psi.MoonTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class MoonSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return MoonParserDefinition().createLexer(null)
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): MoonColor? {
        return when (tokenType) {
            KW_PACKAGE,
            KW_INCLUDE, KW_IMPORT, KW_EXPORT,
            KW_TYPE, KW_PUBLIC, KW_PRIVATE,
            KW_VARIANT, KW_FLAGS, KW_ENUM,
            KW_FN, KW_TEST,
            KW_LET,

            -> MoonColor.KEYWORD

            PARENTHESIS_L, PARENTHESIS_R -> MoonColor.PARENTHESES
            BRACKET_L, BRACKET_R -> MoonColor.BRACKETS
            BRACE_L, BRACE_R -> MoonColor.BRACES
            COLON, EQ -> MoonColor.OPERATION
            AT -> MoonColor.OPERATION

            COMMA -> MoonColor.COMMA
            // atom
            VERSION -> MoonColor.NUMBER

//            SELECTION_LINE -> MoonColor.TEXT
//            STRING_QUOTE, STRING_CHAR -> MoonColor.STRING
//            STRING_ESCAPE -> MoonColor.STRING_ESCAPED
//            STRING -> AwslColor.STRING
            SYMBOL -> MoonColor.IDENTIFIER
            // 注释
            COMMENT_LINE -> MoonColor.LINE_COMMENT
            COMMENT_BLOCK -> MoonColor.BLOCK_COMMENT
            COMMENT_DOCUMENT -> MoonColor.DOC_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> MoonColor.BAD_CHARACTER
            else -> null
        }
    }
}

