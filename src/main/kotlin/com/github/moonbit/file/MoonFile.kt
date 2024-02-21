package com.github.moonbit.file

import com.github.bytecodealliance.MessageBundle
import com.github.bytecodealliance.WionLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class MoonFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, WionLanguage) {
    override fun getFileType(): FileType = WionFileType.INSTANCE
    override fun toString(): String = MessageBundle.message("action.create_file")
}


