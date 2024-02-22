package com.github.moonbit.psi


import com.github.bytecodealliance.language.file.WitFile
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
    fun createLexer(): Lexer = FlexAdapter(_root_ide_package_.com.github.moonbit._WitLexer(null))
    override fun createLexer(project: Project): Lexer = FlexAdapter(
        _root_ide_package_.com.github.moonbit._WitLexer(
            null
        )
    )
    override fun createParser(project: Project): PsiParser =
        _root_ide_package_.com.github.moonbit.parser.WitParser()
    override fun getFileNodeType(): IFileElementType = IFileElementType(WitLanguage)
    override fun getCommentTokens(): TokenSet =
        TokenSet.create(
            _root_ide_package_.com.github.moonbit.psi.WitTypes.COMMENT_LINE,
            _root_ide_package_.com.github.moonbit.psi.WitTypes.COMMENT_DOCUMENT,
            _root_ide_package_.com.github.moonbit.psi.WitTypes.COMMENT_BLOCK
        )

    override fun getStringLiteralElements(): TokenSet = TokenSet.create()
    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    override fun createElement(node: ASTNode): PsiElement =
        _root_ide_package_.com.github.moonbit.psi.WitTypes.Factory.createElement(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = WitFile(viewProvider)
    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

}

