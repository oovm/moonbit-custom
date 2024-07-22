// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonDeclareStruct extends PsiElement {

    @Nullable
    MoonDeclareGeneric getDeclareGeneric();

    @Nullable
    MoonDeriveStatement getDeriveStatement();

    @Nullable
    MoonIdentifier getIdentifier();

    @NotNull
    List<MoonModifier> getModifierList();

    @Nullable
    MoonStructBody getStructBody();

}
