// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface MoonLetStatement extends PsiElement {

    @NotNull
    List<MoonIdentifier> getIdentifierList();

    @Nullable
    MoonModifier getModifier();

    @Nullable
    MoonTermExpression getTermExpression();

}
