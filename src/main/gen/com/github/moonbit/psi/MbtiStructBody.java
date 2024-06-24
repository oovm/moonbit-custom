// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MbtiStructBody extends PsiElement {

    @NotNull
    List<MbtiDeclareField> getDeclareFieldList();

    @NotNull
    List<MbtiDeclareMethod> getDeclareMethodList();

}
