package com.github.bytecodealliance

import com.intellij.lang.Language

object WitLanguage : Language("moonbit") {
    private fun readResolve(): Any = WitLanguage
    override fun getDisplayName(): String {
        return "Moonbit"
    }
}