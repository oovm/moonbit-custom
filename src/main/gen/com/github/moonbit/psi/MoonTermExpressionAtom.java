// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonTermExpressionAtom extends PsiElement {

    @Nullable
    MoonDictLiteral getDictLiteral();

    @Nullable
    MoonIfStatement getIfStatement();

    @Nullable
    MoonListLiteral getListLiteral();

    @Nullable
    MoonNamepath getNamepath();

    @Nullable
    MoonNamepathFree getNamepathFree();

    @Nullable
    MoonNumberLiteral getNumberLiteral();

    @Nullable
    MoonStringLines getStringLines();

    @Nullable
    MoonStringLiteral getStringLiteral();

    @Nullable
    MoonTermExpression getTermExpression();

    @Nullable
    MoonTupleLiteral getTupleLiteral();

}
