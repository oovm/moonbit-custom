// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonTermExpressionAtom extends PsiElement {

    @Nullable
    MoonDictLiteral getDictLiteral();

    @Nullable
    MoonListLiteral getListLiteral();

    @Nullable
    MoonNamepath getNamepath();

    @Nullable
    MoonNumberLiteral getNumberLiteral();

    @Nullable
    MoonStringLiteral getStringLiteral();

    @Nullable
    MoonTermExpression getTermExpression();

}
