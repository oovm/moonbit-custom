// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MoonTypeHintNode extends AnyMoonNode implements MoonTypeHint {

    public MoonTypeHintNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitTypeHint(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonTuple getTuple() {
        return findChildByClass(MoonTuple.class);
    }

    @Override
    @Nullable
    public MoonTypeGeneric getTypeGeneric() {
        return findChildByClass(MoonTypeGeneric.class);
    }

}
