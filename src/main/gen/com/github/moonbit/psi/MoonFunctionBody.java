// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonFunctionBody extends PsiElement {

    @NotNull
    List<MoonControlStatement> getControlStatementList();

    @NotNull
    List<MoonDeclareFunction> getDeclareFunctionList();

    @NotNull
    List<MoonDeclareTest> getDeclareTestList();

    @NotNull
    List<MoonForStatement> getForStatementList();

    @NotNull
    List<MoonLetStatement> getLetStatementList();

    @NotNull
    List<MoonTermExpression> getTermExpressionList();

    @NotNull
    List<MoonTryStatement> getTryStatementList();

    @NotNull
    List<MoonWhileStatement> getWhileStatementList();

}
