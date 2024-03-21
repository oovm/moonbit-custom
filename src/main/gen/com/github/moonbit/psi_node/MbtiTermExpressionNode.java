// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.MbtiTermExpression;
import com.github.moonbit.psi.MbtiTermExpressionItem;
import com.github.moonbit.psi.MbtiTermInfix;
import com.github.moonbit.psi.MbtiVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MbtiTermExpressionNode extends AnyMbtiNode implements MbtiTermExpression {

    public MbtiTermExpressionNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitTermExpression(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<MbtiTermExpressionItem> getTermExpressionItemList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MbtiTermExpressionItem.class);
    }

    @Override
    @NotNull
    public List<MbtiTermInfix> getTermInfixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MbtiTermInfix.class);
    }

}
