// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface MbtiFlags extends PsiElement {

    @Nullable
    MbtiIdentifier getIdentifier();

    @NotNull
    List<MbtiSemanticNumber> getSemanticNumberList();

}