package com.github.moonbit.file

import com.github.bytecodealliance.MessageBundle
import com.github.bytecodealliance.MoonLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class MoonFileType : LanguageFileType(MoonLanguage) {

    override fun getName(): String = MoonLanguage.id

    override fun getDescription(): String = MessageBundle.message("filetype.x.description")

    override fun getDefaultExtension(): String = "mbt;mbti;"

    override fun getIcon(): Icon = MoonIconProvider.Moon

//    companion object {
//        @JvmStatic
//        val INSTANCE = MoonFileType()
//    }
}