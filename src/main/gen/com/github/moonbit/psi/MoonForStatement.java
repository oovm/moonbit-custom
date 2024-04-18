// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonForStatement extends PsiElement {

    @Nullable
    MoonForCondition getForCondition();

    @Nullable
    MoonForInStatement getForInStatement();

    @Nullable
    MoonForIncrement getForIncrement();

    @Nullable
    MoonForStartup getForStartup();

    @Nullable
    MoonFunctionBody getFunctionBody();

}
