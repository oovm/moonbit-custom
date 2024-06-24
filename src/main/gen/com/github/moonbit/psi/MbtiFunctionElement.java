// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MbtiFunctionElement extends PsiElement {

    @Nullable
    MbtiDeclareFunction getDeclareFunction();

    @Nullable
    MbtiDeclareTest getDeclareTest();

    @Nullable
    MbtiIfStatement getIfStatement();

    @Nullable
    MbtiLetStatement getLetStatement();

    @Nullable
    MbtiWhileStatement getWhileStatement();

}
