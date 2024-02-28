package com.github.moonbit.file

import com.github.bytecodealliance.MessageBundle
import com.github.bytecodealliance.WitLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class MoonFileType : LanguageFileType {
    private constructor() : super(WitLanguage)

    override fun getName(): String = WitLanguage.id

    override fun getDescription(): String = MessageBundle.message("filetype.x.description")

    override fun getDefaultExtension(): String = "mbt;"

    override fun getIcon(): Icon = MoonIconProvider.Moon

    companion object {
        @JvmStatic
        val INSTANCE = MoonFileType()
    }
}