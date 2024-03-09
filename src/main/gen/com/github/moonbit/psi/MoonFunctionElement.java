// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface MoonFunctionElement extends PsiElement {

    @Nullable
    MoonDeclareFunction getDeclareFunction();

    @Nullable
    MoonIfStatement getIfStatement();

    @Nullable
    MoonLetStatement getLetStatement();

    @Nullable
    MoonTestStatement getTestStatement();

    @Nullable
    MoonWhileStatement getWhileStatement();

}
