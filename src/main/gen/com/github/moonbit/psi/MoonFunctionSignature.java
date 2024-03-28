// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonFunctionSignature extends PsiElement {

    @Nullable
    MoonDeclareGeneric getDeclareGeneric();

    @NotNull
    MoonDeclareParameter getDeclareParameter();

    @NotNull
    MoonIdentifier getIdentifier();

    @Nullable
    MoonModifier getModifier();

    @Nullable
    MoonTypeHint getTypeHint();

}
