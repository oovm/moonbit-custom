// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface MoonDeclareFunction extends PsiElement {

    @Nullable
    MoonDeclareGeneric getDeclareGeneric();

    @Nullable
    MoonDeclareParameter getDeclareParameter();

    @Nullable
    MoonFunctionBody getFunctionBody();

    @NotNull
    MoonIdentifier getIdentifier();

    @NotNull
    List<MoonModifier> getModifierList();

}
