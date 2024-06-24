// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MbtiVariant extends PsiElement {

    @Nullable
    MbtiIdentifier getIdentifier();

    @NotNull
    List<MbtiVariantItem> getVariantItemList();

}
