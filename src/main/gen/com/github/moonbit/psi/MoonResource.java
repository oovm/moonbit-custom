// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonResource extends PsiElement {

    @NotNull
    List<MoonConstructor> getConstructorList();

    @Nullable
    MoonIdentifier getIdentifier();

    @NotNull
    List<MoonMethod> getMethodList();

}
