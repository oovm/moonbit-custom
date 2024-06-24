// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MbtiTermExpressionItemNode extends AnyMbtiNode implements MbtiTermExpressionItem {

    public MbtiTermExpressionItemNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitTermExpressionItem(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public MbtiTermExpressionAtom getTermExpressionAtom() {
        return findNotNullChildByClass(MbtiTermExpressionAtom.class);
    }

    @Override
    @NotNull
    public List<MbtiTermPrefix> getTermPrefixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MbtiTermPrefix.class);
    }

    @Override
    @NotNull
    public List<MbtiTermSuffix> getTermSuffixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MbtiTermSuffix.class);
    }

}
