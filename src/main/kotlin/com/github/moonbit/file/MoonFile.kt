package com.github.moonbit.file

import com.github.bytecodealliance.MessageBundle
import com.github.bytecodealliance.MoonLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class MoonFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, MoonLanguage) {
    override fun getFileType(): FileType = MoonFileType()
    override fun toString(): String = MessageBundle.message("action.create_file")
}


