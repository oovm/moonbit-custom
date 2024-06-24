// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MbtiTypeExpression extends PsiElement {

    @NotNull
    List<MbtiTypeExpressionItem> getTypeExpressionItemList();

    @NotNull
    List<MbtiTypeInfix> getTypeInfixList();

}
