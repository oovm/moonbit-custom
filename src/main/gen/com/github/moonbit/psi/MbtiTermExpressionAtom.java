// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface MbtiTermExpressionAtom extends PsiElement {

    @Nullable
    MbtiIdentifier getIdentifier();

    @Nullable
    MbtiNumberLiteral getNumberLiteral();

    @Nullable
    MbtiStringLiteral getStringLiteral();

    @Nullable
    MbtiTermExpression getTermExpression();

}
