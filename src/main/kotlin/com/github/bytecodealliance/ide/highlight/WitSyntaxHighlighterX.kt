package com.github.bytecodealliance.ide.highlight

import com.github.bytecodealliance.language.psi.WitParserDefinitionX
import com.github.moonbit.psi.WitxTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class WitSyntaxHighlighterX : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return WitParserDefinitionX().createLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): WitColor? {
        return when (tokenType) {
            KW_TYPE, KW_ENUM, KW_RECORD,
                -> WitColor.KEYWORD

            _root_ide_package_.com.github.moonbit.psi.WitTypes.PARENTHESIS_L, _root_ide_package_.com.github.moonbit.psi.WitTypes.PARENTHESIS_R -> WitColor.PARENTHESES
            _root_ide_package_.com.github.moonbit.psi.WitTypes.BRACKET_L, _root_ide_package_.com.github.moonbit.psi.WitTypes.BRACKET_R -> WitColor.BRACKETS
            _root_ide_package_.com.github.moonbit.psi.WitTypes.BRACE_L, _root_ide_package_.com.github.moonbit.psi.WitTypes.BRACE_R -> WitColor.BRACES
            _root_ide_package_.com.github.moonbit.psi.WitTypes.COLON, _root_ide_package_.com.github.moonbit.psi.WitTypes.EQ -> WitColor.OPERATION
            _root_ide_package_.com.github.moonbit.psi.WitTypes.AT, _root_ide_package_.com.github.moonbit.psi.WitTypes.STAR -> WitColor.OPERATION

            _root_ide_package_.com.github.moonbit.psi.WitTypes.COMMA -> WitColor.COMMA
            // atom
            _root_ide_package_.com.github.moonbit.psi.WitTypes.VERSION -> WitColor.NUMBER

            _root_ide_package_.com.github.moonbit.psi.WitTypes.SELECTION_LINE -> WitColor.TEXT
            _root_ide_package_.com.github.moonbit.psi.WitTypes.STRING_QUOTE, _root_ide_package_.com.github.moonbit.psi.WitTypes.STRING_CHAR -> WitColor.STRING
            _root_ide_package_.com.github.moonbit.psi.WitTypes.STRING_ESCAPE -> WitColor.STRING_ESCAPED
//            STRING -> AwslColor.STRING
            _root_ide_package_.com.github.moonbit.psi.WitTypes.SYMBOL -> WitColor.IDENTIFIER
            // 注释
            COMMENT_LINE -> WitColor.LINE_COMMENT
            COMMENT_BLOCK -> WitColor.BLOCK_COMMENT
            COMMENT_DOCUMENT -> WitColor.DOC_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> WitColor.BAD_CHARACTER
            else -> null
        }
    }
}