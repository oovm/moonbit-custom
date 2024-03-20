// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface MbtiLetStatement extends PsiElement {

    @Nullable
    MbtiIdentifier getIdentifier();

    @Nullable
    MbtiModifier getModifier();

    @Nullable
    MbtiTermExpression getTermExpression();

    @Nullable
    MbtiTypeExpression getTypeExpression();

}
