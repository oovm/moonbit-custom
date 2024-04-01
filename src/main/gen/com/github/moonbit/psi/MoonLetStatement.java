// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonLetStatement extends PsiElement {

    @Nullable
    MoonIdentifier getIdentifier();

    @Nullable
    MoonModifier getModifier();

    @Nullable
    MoonTermExpression getTermExpression();

    @Nullable
    MoonTypeHint getTypeHint();

}
