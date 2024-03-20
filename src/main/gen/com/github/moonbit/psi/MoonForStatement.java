// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

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
