// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MbtiDeclareMethod extends PsiElement {

    @NotNull
    MbtiDeclareParameter getDeclareParameter();

    @NotNull
    MbtiIdentifier getIdentifier();

    @Nullable
    MbtiTypeReturn getTypeReturn();

}
