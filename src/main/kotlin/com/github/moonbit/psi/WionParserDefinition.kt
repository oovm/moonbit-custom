package com.github.moonbit.psi

import com.github.bytecodealliance.WionLanguage
import com.github.bytecodealliance.language.file.WionFile
import com.intellij.json.JsonTokenSets
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lexer.FlexAdapter
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class WionParserDefinition : ParserDefinition {
    fun createLexer() = FlexAdapter(_root_ide_package_.com.github.moonbit._WionLexer(null))
    override fun createLexer(project: Project) = FlexAdapter(_root_ide_package_.com.github.moonbit._WionLexer(null))
    override fun createParser(project: Project) = _root_ide_package_.com.github.moonbit.parser.WionParser()
    override fun getFileNodeType() = IFileElementType(WionLanguage)
    override fun getCommentTokens(): TokenSet {
        return JsonTokenSets.JSON_COMMENTARIES
    }

    override fun getStringLiteralElements(): TokenSet = TokenSet.create()
    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    override fun createElement(node: ASTNode): PsiElement = _root_ide_package_.com.github.moonbit.psi.WionTypes.Factory.createElement(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = WionFile(viewProvider)
    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }
}