// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface WitIncludeName extends PsiElement {

    @NotNull
    List<WitIdentifier> getIdentifierList();

    @NotNull
    WitInterfaceName getInterfaceName();

    @Nullable
    WitPackageVersion getPackageVersion();

}
