// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface MoonTermExpressionAtom extends PsiElement {

    @Nullable
    MoonIdentifier getIdentifier();

    @Nullable
    MoonNumberLiteral getNumberLiteral();

    @Nullable
    MoonStringLiteral getStringLiteral();

    @Nullable
    MoonTermExpression getTermExpression();

}