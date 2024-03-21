// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.MbtiTuple;
import com.github.moonbit.psi.MbtiTypeGeneric;
import com.github.moonbit.psi.MbtiTypeHint;
import com.github.moonbit.psi.MbtiVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MbtiTypeHintNode extends AnyMbtiNode implements MbtiTypeHint {

    public MbtiTypeHintNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitTypeHint(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiTuple getTuple() {
        return findChildByClass(MbtiTuple.class);
    }

    @Override
    @Nullable
    public MbtiTypeGeneric getTypeGeneric() {
        return findChildByClass(MbtiTypeGeneric.class);
    }

}
