package com.github.bytecodealliance.ide.matcher


import com.github.moonbit.psi.MoonRecursiveVisitor
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.psi.PsiElement

class WitFoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : MoonRecursiveVisitor() {

//    override fun visitInterfaceBody(o: MoonInterfaceBody) {
//        descriptors += FoldingDescriptor(o.node, TextRange(o.firstChild.endOffset, o.lastChild.startOffset))
//    }


    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }
}
