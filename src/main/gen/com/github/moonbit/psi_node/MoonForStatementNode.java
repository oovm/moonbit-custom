// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class MoonForStatementNode extends AnyMoonNode implements MoonForStatement {

    public MoonForStatementNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitForStatement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public MoonForCondition getForCondition() {
        return findNotNullChildByClass(MoonForCondition.class);
    }

    @Override
    @NotNull
    public MoonForIncrement getForIncrement() {
        return findNotNullChildByClass(MoonForIncrement.class);
    }

    @Override
    @NotNull
    public MoonForStartup getForStartup() {
        return findNotNullChildByClass(MoonForStartup.class);
    }

    @Override
    @NotNull
    public MoonFunctionBody getFunctionBody() {
        return findNotNullChildByClass(MoonFunctionBody.class);
    }

}