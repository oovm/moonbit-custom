// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonTermExpressionItem extends PsiElement {

    @NotNull
    MoonTermExpressionAtom getTermExpressionAtom();

    @NotNull
    List<MoonTermPrefix> getTermPrefixList();

    @NotNull
    List<MoonTermSuffix> getTermSuffixList();

}
