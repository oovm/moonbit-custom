package com.github.moonbit.psi

import com.github.moonbit.MoonLanguage
import com.intellij.psi.tree.IElementType

class MoonElementType(debugName: String) : IElementType(debugName, MoonLanguage) {
    override fun toString(): String = "MoonNode.${super.toString()}"
}

class MoonTokenType(debugName: String) : IElementType(debugName, MoonLanguage) {
    override fun toString(): String = "MoonLeaf.${super.toString()}"
}

