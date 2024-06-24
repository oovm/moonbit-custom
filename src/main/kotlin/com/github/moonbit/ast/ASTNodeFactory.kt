package com.github.moonbit.ast

import com.github.moonbit.MoonLanguage
import com.github.moonbit.file.MoonFile
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFileFactory

class ASTNodeFactory(private val project: Project) {
    fun createFile(text: String): MoonFile {
        val file = PsiFileFactory.getInstance(project).createFileFromText("dummy.fluent", MoonLanguage, text)
        return file as MoonFile
    }
}