package com.github.moonbit.mixin

import com.github.bytecodealliance.ide.view.WitItemPresentation

import com.github.bytecodealliance.language.psi.WitElement

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner

abstract class MixinInterface(node: ASTNode) : WitElement(node), PsiNameIdentifierOwner,
    _root_ide_package_.com.github.moonbit.psi.WitDefineInterface {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.interfaceName
    }


    override fun getPresentation(): ItemPresentation? {
        return WitItemPresentation(AllIcons.Nodes.Interface, nameIdentifier?.text ?: "missing interface")
    }
}


