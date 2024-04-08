package com.github.moonbit.ide.highlight

import com.github.bytecodealliance.ide.highlight.MoonColor
import com.github.moonbit.file.MoonIconProvider
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class MoonHighlightSetting : ColorSettingsPage {
    private val annotatorTags = MoonColor.entries
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = MoonColor.entries
        .map { it.attributesDescriptor }
        .toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = "Moonbit"

    override fun getIcon() = MoonIconProvider.Moon

    override fun getHighlighter() = MoonTokenHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags

    override fun getDemoText() = javaClass.getResource("/colors/moon.ftl")!!.readText()
}

