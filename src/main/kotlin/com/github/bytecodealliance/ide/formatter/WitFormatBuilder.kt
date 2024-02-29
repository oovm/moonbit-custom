package com.github.bytecodealliance.ide.formatter


import com.github.moonbit.psi.MoonWorld
import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiFile

class WitFormatBuilder : FormattingModelBuilder {
    override fun getRangeAffectingIndent(file: PsiFile?, offset: Int, elementAtOffset: ASTNode?): TextRange? = null

    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val settings = formattingContext.codeStyleSettings
        val element = formattingContext.psiElement
        val ctx = WitFormatSpace.create(settings)
        val block = FormatBlock(element.node, null, Indent.getNoneIndent(), null, ctx)
        return FormattingModelProvider.createFormattingModelForPsiFile(element.containingFile, block, settings)
    }

    companion object {
        fun getChildAttributes(node: ASTNode, newChildIndex: Int): ChildAttributes {
            val indent = when (node.elementType) {
//                FluentTypes.SELECT_EXPRESSION -> Indent.getNormalIndent()
                else -> Indent.getNoneIndent()
            }
            return ChildAttributes(indent, null)
        }

        fun computeIndent(parent: ASTNode, child: ASTNode): Indent? {
            return when (parent.psi) {
                is MoonWorld -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitInterfaceBody -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitUseItems -> parent.indentInRange(child, 2, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitResource -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitRecord -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitFlags -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitEnum -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitVariant -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitFunctionSignature -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitTuple -> parent.indentInRange(child, 1, 1)
//                is _root_ide_package_.com.github.moonbit.psi.WitGeneric -> parent.indentInRange(child, 1, 1)

                else -> Indent.getNoneIndent()
            }
        }

        private fun ASTNode.indentInRange(child: ASTNode, head: Int, tail: Int): Indent {
            val children = this.getChildren(null);
            val index = children.indexOf(child)
            val last = children.size - tail
            return when {
                index <= head -> Indent.getNoneIndent()
                index >= last -> Indent.getNoneIndent()
                else -> Indent.getNormalIndent()
            }
        }
    }
}
