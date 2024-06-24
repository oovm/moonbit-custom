// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MbtiTypeExpressionItem extends PsiElement {

    @NotNull
    MbtiTypeExpressionAtom getTypeExpressionAtom();

    @NotNull
    List<MbtiTypePrefix> getTypePrefixList();

    @NotNull
    List<MbtiTypeSuffix> getTypeSuffixList();

}
