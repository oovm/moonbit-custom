package com.github.moonbit.ide.matcher


import com.github.moonbit.psi.MoonVisitor
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.progress.ProgressManager
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveVisitor

class MoonFoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : MoonVisitor(), PsiRecursiveVisitor {
    override fun visitElement(element: PsiElement) {
        ProgressManager.checkCanceled()
        element.acceptChildren(this)
    }

//    override fun visitInterfaceBody(o: MoonInterfaceBody) {
//        descriptors += FoldingDescriptor(o.node, TextRange(o.firstChild.endOffset, o.lastChild.startOffset))
//    }


    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }
}
