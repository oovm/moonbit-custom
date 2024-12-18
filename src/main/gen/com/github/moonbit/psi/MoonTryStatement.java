// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonTryStatement extends PsiElement {

    @NotNull
    List<MoonCatchExpression> getCatchExpressionList();

    @NotNull
    MoonTryExpression getTryExpression();

}
