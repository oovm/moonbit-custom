// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.AnyMbtiNode;
import com.github.moonbit.psi.MbtiIdentifier;
import com.github.moonbit.psi.MbtiMatchVariant;
import com.github.moonbit.psi.MbtiVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class MbtiMatchVariantNode extends AnyMbtiNode implements MbtiMatchVariant {

    public MbtiMatchVariantNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitMatchVariant(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public MbtiIdentifier getIdentifier() {
        return findNotNullChildByClass(MbtiIdentifier.class);
    }

}
