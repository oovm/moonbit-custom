package com.github.moonbit

import com.intellij.lang.Language

object MbtiLanguage : Language("mbti") {
    private fun readResolve(): Any = MoonLanguage
    override fun getDisplayName(): String {
        return "Moonbit Interface"
    }
}