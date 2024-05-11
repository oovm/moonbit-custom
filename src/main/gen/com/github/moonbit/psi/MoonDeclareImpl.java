// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonDeclareImpl extends PsiElement {

    @Nullable
    MoonDeclareGeneric getDeclareGeneric();

    @Nullable
    MoonImplFor getImplFor();

    @Nullable
    MoonImplWith getImplWith();

    @NotNull
    List<MoonModifier> getModifierList();

    @Nullable
    MoonNamepath getNamepath();

}
