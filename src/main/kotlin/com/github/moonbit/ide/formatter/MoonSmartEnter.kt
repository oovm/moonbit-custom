package com.github.bytecodealliance.ide.formatter

import com.github.moonbit.file.MoonFile
import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class MoonSmartEnter : SmartEnterProcessorWithFixers() {
    init {
        addFixers(
            MoonCommaFixer()
        )
        addEnterProcessors(
            PlainEnterProcessor()
        )
    }

    override fun doNotStepInto(element: PsiElement): Boolean {
        return true
    }

    override fun processDefaultEnter(project: Project, editor: Editor, file: PsiFile) {
        plainEnter(editor)
    }

    private class PlainEnterProcessor : FixEnterProcessor() {
        override fun doEnter(atCaret: PsiElement, file: PsiFile, editor: Editor, modified: Boolean): Boolean {
            if (file is MoonFile) {
                plainEnter(editor)
                return true
            } else {
                return false
            }
        }
    }
}
