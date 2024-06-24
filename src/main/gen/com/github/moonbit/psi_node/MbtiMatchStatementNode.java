// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MbtiMatchStatementNode extends AnyMbtiNode implements MbtiMatchStatement {

    public MbtiMatchStatementNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitMatchStatement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiMatchBody getMatchBody() {
        return findChildByClass(MbtiMatchBody.class);
    }

    @Override
    @Nullable
    public MbtiTermExpression getTermExpression() {
        return findChildByClass(MbtiTermExpression.class);
    }

}
