package com.github.moonbit.file

import com.github.moonbit.MessageBundle
import com.github.moonbit.MoonLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class MoonFileType : LanguageFileType {
    /// use `INSTANCE`
    private constructor() : super(MoonLanguage)

    override fun getName(): String = MoonLanguage.id

    override fun getDescription(): String = MessageBundle.message("filetype.x.description")

    override fun getDefaultExtension(): String = "mbt;mbti;"

    override fun getIcon(): Icon = MoonIconProvider.Moon

    @Suppress("CompanionObjectInExtension")
    companion object {
        @JvmStatic
        val INSTANCE = MoonFileType()
    }
}

class MoonInterfaceFileType : LanguageFileType {
    /// use `INSTANCE`
    private constructor() : super(MoonLanguage)

    override fun getName(): String = MoonLanguage.id

    override fun getDescription(): String = MessageBundle.message("filetype.x.description")

    override fun getDefaultExtension(): String = "mbti;"

    override fun getIcon(): Icon = MoonIconProvider.Moon

    @Suppress("CompanionObjectInExtension")
    companion object {
        @JvmStatic
        val INSTANCE = MoonInterfaceFileType()
    }
}