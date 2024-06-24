// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MbtiDeclareMethod extends PsiElement {

    @NotNull
    MbtiDeclareParameter getDeclareParameter();

    @NotNull
    MbtiIdentifier getIdentifier();

    @Nullable
    MbtiTypeReturn getTypeReturn();

}
