// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.MbtiIdentifier;
import com.github.moonbit.psi.MbtiTypeExpression;
import com.github.moonbit.psi.MbtiTypeExpressionAtom;
import com.github.moonbit.psi.MbtiVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MbtiTypeExpressionAtomNode extends AnyMbtiNode implements MbtiTypeExpressionAtom {

    public MbtiTypeExpressionAtomNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitTypeExpressionAtom(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiIdentifier getIdentifier() {
        return findChildByClass(MbtiIdentifier.class);
    }

    @Override
    @Nullable
    public MbtiTypeExpression getTypeExpression() {
        return findChildByClass(MbtiTypeExpression.class);
    }

}
