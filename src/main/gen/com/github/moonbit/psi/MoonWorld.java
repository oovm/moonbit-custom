// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonWorld extends PsiElement {

    @NotNull
    List<MoonDefineType> getDefineTypeList();

    @NotNull
    List<MoonEnum> getEnumList();

    @NotNull
    List<MoonExport> getExportList();

    @Nullable
    MoonIdentifier getIdentifier();

    @NotNull
    List<MoonImport> getImportList();

    @NotNull
    List<MoonInclude> getIncludeList();

    @Nullable
    MoonModifier getModifier();

    @NotNull
    List<MoonRecord> getRecordList();

    @NotNull
    List<MoonResource> getResourceList();

    @NotNull
    List<MoonUse> getUseList();

    @NotNull
    List<MoonVariant> getVariantList();

}
