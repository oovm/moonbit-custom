package com.github.moonbit.mixin

import com.github.bytecodealliance.ide.view.WitItemPresentation

import com.github.bytecodealliance.language.psi.WitElement
import com.github.moonbit.psi.MoonElement
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner

abstract class MixinRecord(node: ASTNode) : MoonElement(node),
    PsiNameIdentifierOwner,
    WitRecord {
    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): PsiElement? {
        return this.identifier
    }

    override fun getPresentation(): ItemPresentation? {
        return WitItemPresentation(AllIcons.Nodes.Record, nameIdentifier?.text ?: "missing record")
    }
}
