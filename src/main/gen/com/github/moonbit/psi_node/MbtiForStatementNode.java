// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class MbtiForStatementNode extends AnyMbtiNode implements MbtiForStatement {

    public MbtiForStatementNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitForStatement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public MbtiForCondition getForCondition() {
        return findNotNullChildByClass(MbtiForCondition.class);
    }

    @Override
    @NotNull
    public MbtiForIncrement getForIncrement() {
        return findNotNullChildByClass(MbtiForIncrement.class);
    }

    @Override
    @NotNull
    public MbtiForStartup getForStartup() {
        return findNotNullChildByClass(MbtiForStartup.class);
    }

    @Override
    @NotNull
    public MbtiFunctionBody getFunctionBody() {
        return findNotNullChildByClass(MbtiFunctionBody.class);
    }

}
