package com.github.moonbit.psi

import com.github.bytecodealliance.WitLanguage
import com.intellij.psi.tree.IElementType

class WitTokenType(debugName: String) : IElementType(debugName, WitLanguage) {
    override fun toString(): String = "WitToken.${super.toString()}"
}

