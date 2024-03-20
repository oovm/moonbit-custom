// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface MbtiForStatement extends PsiElement {

    @NotNull
    MbtiForCondition getForCondition();

    @NotNull
    MbtiForIncrement getForIncrement();

    @NotNull
    MbtiForStartup getForStartup();

    @NotNull
    MbtiFunctionBody getFunctionBody();

}
