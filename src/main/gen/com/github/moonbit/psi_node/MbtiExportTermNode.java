// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MbtiExportTermNode extends AnyMbtiNode implements MbtiExportTerm {

    public MbtiExportTermNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitExportTerm(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiDeclareTest getDeclareTest() {
        return findChildByClass(MbtiDeclareTest.class);
    }

    @Override
    @Nullable
    public MbtiFunction getFunction() {
        return findChildByClass(MbtiFunction.class);
    }

    @Override
    @Nullable
    public MbtiIncludeName getIncludeName() {
        return findChildByClass(MbtiIncludeName.class);
    }

}