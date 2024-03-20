// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

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
