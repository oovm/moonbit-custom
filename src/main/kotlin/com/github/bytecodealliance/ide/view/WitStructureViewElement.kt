package com.github.bytecodealliance.ide.view

import com.github.bytecodealliance.language.file.WitFile
import com.intellij.ide.projectView.PresentationData
import com.intellij.ide.structureView.StructureViewTreeElement
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement
import com.intellij.ide.util.treeView.smartTree.TreeElement
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.util.PsiTreeUtil

class WitStructureViewElement(private val node: NavigatablePsiElement) :
    StructureViewTreeElement,
    SortableTreeElement {
    override fun getValue(): Any {
        return node
    }

    override fun navigate(requestFocus: Boolean) {
        node.navigate(requestFocus)
    }

    override fun canNavigate(): Boolean {
        return node.canNavigate()
    }

    override fun canNavigateToSource(): Boolean {
        return node.canNavigateToSource()
    }

    override fun getAlphaSortKey(): String {
        val name = node.name
        return name ?: ""
    }

    override fun getPresentation(): ItemPresentation {
        val presentation = node.presentation
        return presentation ?: PresentationData()
    }

    override fun getChildren(): Array<out TreeElement> = when (node) {
        is WitFile -> getChildOfType(
            _root_ide_package_.com.github.moonbit.psi_node.WitWorldNode::class.java,
            _root_ide_package_.com.github.moonbit.psi_node.WitDefineInterfaceNode::class.java,
        )

        is _root_ide_package_.com.github.moonbit.psi.WitWorld -> getChildOfType(
            _root_ide_package_.com.github.moonbit.psi_node.WitExportNode::class.java,
        )

        is _root_ide_package_.com.github.moonbit.psi.WitDefineInterface -> getChildOfType(
            _root_ide_package_.com.github.moonbit.psi_node.WitResourceNode::class.java,
            _root_ide_package_.com.github.moonbit.psi_node.WitRecordNode::class.java,
            _root_ide_package_.com.github.moonbit.psi_node.WitVariantNode::class.java,
            _root_ide_package_.com.github.moonbit.psi_node.WitEnumNode::class.java,
            _root_ide_package_.com.github.moonbit.psi_node.WitFlagsNode::class.java,
            _root_ide_package_.com.github.moonbit.psi_node.WitFunctionNode::class.java,
        )

        is _root_ide_package_.com.github.moonbit.psi.WitResource -> getChildOfType(
            _root_ide_package_.com.github.moonbit.psi_node.WitMethodNode::class.java
        )

        is _root_ide_package_.com.github.moonbit.psi.WitRecord -> getChildOfType(
            _root_ide_package_.com.github.moonbit.psi_node.WitRecordFieldNode::class.java
        )

        is _root_ide_package_.com.github.moonbit.psi.WitEnum, is _root_ide_package_.com.github.moonbit.psi.WitFlags -> getChildOfType(
            _root_ide_package_.com.github.moonbit.psi_node.WitSemanticNumberNode::class.java
        )

        is _root_ide_package_.com.github.moonbit.psi.WitVariant -> getChildOfType(
            _root_ide_package_.com.github.moonbit.psi_node.WitVariantItemNode::class.java
        )

        else -> getChildOfType(
//            NavigatablePsiElement::class.java,
        )
    }

    private fun getChildOfType(vararg classes: Class<out NavigatablePsiElement>): Array<WitStructureViewElement> {
        return PsiTreeUtil.getChildrenOfAnyType(node, *classes)
            .map { WitStructureViewElement(it) }
            .toTypedArray()
    }
}

