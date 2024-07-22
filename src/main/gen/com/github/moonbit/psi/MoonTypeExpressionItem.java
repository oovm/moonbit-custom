// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonTypeExpressionItem extends PsiElement {

    @NotNull
    MoonTypeExpressionAtom getTypeExpressionAtom();

    @NotNull
    List<MoonTypePrefix> getTypePrefixList();

    @NotNull
    List<MoonTypeSuffix> getTypeSuffixList();

}
