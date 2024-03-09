// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MoonFunctionElementNode extends AnyMoonNode implements MoonFunctionElement {

    public MoonFunctionElementNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitFunctionElement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonDeclareFunction getDeclareFunction() {
        return findChildByClass(MoonDeclareFunction.class);
    }

    @Override
    @Nullable
    public MoonIfStatement getIfStatement() {
        return findChildByClass(MoonIfStatement.class);
    }

    @Override
    @Nullable
    public MoonLetStatement getLetStatement() {
        return findChildByClass(MoonLetStatement.class);
    }

    @Override
    @Nullable
    public MoonTestStatement getTestStatement() {
        return findChildByClass(MoonTestStatement.class);
    }

    @Override
    @Nullable
    public MoonWhileStatement getWhileStatement() {
        return findChildByClass(MoonWhileStatement.class);
    }

}
