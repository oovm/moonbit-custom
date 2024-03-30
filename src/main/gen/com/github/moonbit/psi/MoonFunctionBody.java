// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonFunctionBody extends PsiElement {

    @NotNull
    List<MoonDeclareFunction> getDeclareFunctionList();

    @NotNull
    List<MoonDeclareTest> getDeclareTestList();

    @NotNull
    List<MoonIfStatement> getIfStatementList();

    @NotNull
    List<MoonLetStatement> getLetStatementList();

    @NotNull
    List<MoonTermExpression> getTermExpressionList();

    @NotNull
    List<MoonWhileStatement> getWhileStatementList();

}
