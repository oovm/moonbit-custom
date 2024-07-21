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

public class MbtiDeclareParameterNode extends AnyMbtiNode implements MbtiDeclareParameter {

    public MbtiDeclareParameterNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitDeclareParameter(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<MbtiTypeExpression> getTypeExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MbtiTypeExpression.class);
    }

}
