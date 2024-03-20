// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MbtiFunctionElementNode extends AnyMbtiNode implements MbtiFunctionElement {

    public MbtiFunctionElementNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitFunctionElement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiDeclareFunction getDeclareFunction() {
        return findChildByClass(MbtiDeclareFunction.class);
    }

    @Override
    @Nullable
    public MbtiDeclareTest getDeclareTest() {
        return findChildByClass(MbtiDeclareTest.class);
    }

    @Override
    @Nullable
    public MbtiIfStatement getIfStatement() {
        return findChildByClass(MbtiIfStatement.class);
    }

    @Override
    @Nullable
    public MbtiLetStatement getLetStatement() {
        return findChildByClass(MbtiLetStatement.class);
    }

    @Override
    @Nullable
    public MbtiWhileStatement getWhileStatement() {
        return findChildByClass(MbtiWhileStatement.class);
    }

}
