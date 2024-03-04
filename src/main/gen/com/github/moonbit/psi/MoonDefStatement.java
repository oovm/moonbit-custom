// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface MoonDefStatement extends PsiElement {

    @Nullable
    MoonIdentifier getIdentifier();

    @NotNull
    List<MoonModifier> getModifierList();

}
