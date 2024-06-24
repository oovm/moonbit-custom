// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.github.moonbit.psi.MbtiTypes.*;

import com.github.moonbit.psi.AnyMbtiNode;
import com.github.moonbit.psi.*;

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
