package com.github.moonbit.psi


import com.github.bytecodealliance.MoonLanguage
import com.github.moonbit._MoonLexer
import com.github.moonbit.file.MoonFile
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class MoonParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = MoonLexer

    override fun createParser(project: Project): PsiParser =
        _root_ide_package_.com.github.moonbit.parser.WitParser()

    override fun getFileNodeType(): IFileElementType = IFileElementType(MoonLanguage)
    override fun getCommentTokens(): TokenSet =
        TokenSet.create(
            _root_ide_package_.com.github.moonbit.psi.MoonTypes.COMMENT_LINE,
            _root_ide_package_.com.github.moonbit.psi.MoonTypes.COMMENT_DOCUMENT,
            _root_ide_package_.com.github.moonbit.psi.MoonTypes.COMMENT_BLOCK
        )

    override fun getStringLiteralElements(): TokenSet = TokenSet.create()
    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    override fun createElement(node: ASTNode): PsiElement =
        _root_ide_package_.com.github.moonbit.psi.MoonTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = MoonFile(viewProvider)
    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    companion object {
        val MoonLexer = FlexAdapter(_MoonLexer(null));
    }
}

