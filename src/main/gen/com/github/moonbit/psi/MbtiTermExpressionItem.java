// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MbtiTermExpressionItem extends PsiElement {

    @NotNull
    MbtiTermExpressionAtom getTermExpressionAtom();

    @NotNull
    List<MbtiTermPrefix> getTermPrefixList();

    @NotNull
    List<MbtiTermSuffix> getTermSuffixList();

}
