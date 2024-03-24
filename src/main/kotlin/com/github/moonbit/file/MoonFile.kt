package com.github.moonbit.file

import com.github.moonbit.MessageBundle
import com.github.moonbit.MoonLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class MoonFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, MoonLanguage) {
    override fun getFileType(): FileType = MoonFileType.INSTANCE
    override fun toString(): String = MessageBundle.message("action.create_file")
}


