// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MbtiDeclareFunction extends PsiElement {

    @Nullable
    MbtiDeclareGeneric getDeclareGeneric();

    @Nullable
    MbtiDeclareParameter getDeclareParameter();

    @Nullable
    MbtiFunctionBody getFunctionBody();

    @NotNull
    MbtiIdentifier getIdentifier();

    @NotNull
    List<MbtiModifier> getModifierList();

}
