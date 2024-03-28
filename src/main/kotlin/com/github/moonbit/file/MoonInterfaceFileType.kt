package com.github.moonbit.file

import com.github.moonbit.MbtiLanguage
import com.github.moonbit.MessageBundle
import com.github.moonbit.MoonLanguage
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class MoonInterfaceFileType : LanguageFileType {
    /// use `INSTANCE`
    private constructor() : super(MbtiLanguage)

    override fun getName(): String = MbtiLanguage.id

    override fun getDescription(): String = MessageBundle.message("filetype.mbti.description")

    override fun getDefaultExtension(): String = "mbti;"

    override fun getIcon(): Icon = MoonIconProvider.Moon

    @Suppress("CompanionObjectInExtension")
    companion object {
        @JvmStatic
        val INSTANCE = MoonInterfaceFileType()
    }
}