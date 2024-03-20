// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MbtiFunctionSignatureNode extends AnyMbtiNode implements MbtiFunctionSignature {

    public MbtiFunctionSignatureNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitFunctionSignature(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiModifier getModifier() {
        return findChildByClass(MbtiModifier.class);
    }

    @Override
    @Nullable
    public MbtiTuple getTuple() {
        return findChildByClass(MbtiTuple.class);
    }

    @Override
    @Nullable
    public MbtiTypeHint getTypeHint() {
        return findChildByClass(MbtiTypeHint.class);
    }

}
