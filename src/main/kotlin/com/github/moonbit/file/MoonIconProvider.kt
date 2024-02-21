package com.github.moonbit.file

import com.intellij.ide.IconProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

class MoonIconProvider : IconProvider() {
    override fun getIcon(psiElement: PsiElement, flags: Int): Icon? {
        val fileName = psiElement.containingFile.name

        return when {
            fileName.endsWith(".mbt") -> Moon
            else -> null
        }
    }

    companion object {
        val Moon = IconLoader.getIcon("/icons/mbt.svg", MoonIconProvider::class.java)
    }
}
