// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface MoonForStatement extends PsiElement {

    @NotNull
    MoonForCondition getForCondition();

    @NotNull
    MoonForIncrement getForIncrement();

    @NotNull
    MoonForStartup getForStartup();

    @NotNull
    MoonFunctionBody getFunctionBody();

}
