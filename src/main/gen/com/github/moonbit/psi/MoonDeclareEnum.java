// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonDeclareEnum extends PsiElement {

    @Nullable
    MoonAppendDerive getAppendDerive();

    @Nullable
    MoonEnumBody getEnumBody();

    @Nullable
    MoonIdentifier getIdentifier();

    @NotNull
    List<MoonModifier> getModifierList();

}
