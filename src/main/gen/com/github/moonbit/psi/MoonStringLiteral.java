// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MoonStringLiteral extends PsiElement {

    @NotNull
    List<MoonDefineType> getDefineTypeList();

    @NotNull
    List<MoonEnum> getEnumList();

    @NotNull
    List<MoonFlags> getFlagsList();

    @NotNull
    List<MoonFunction> getFunctionList();

    @NotNull
    List<MoonRecord> getRecordList();

    @NotNull
    List<MoonStructStatement> getStructStatementList();

    @NotNull
    List<MoonVariant> getVariantList();

    @NotNull
    List<MoonWhileStatement> getWhileStatementList();

}