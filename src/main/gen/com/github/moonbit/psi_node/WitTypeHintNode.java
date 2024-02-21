// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitTuple;
import com.github.moonbit.psi.WitTypeGeneric;
import com.github.moonbit.psi.WitTypeHint;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitTypeHintNode extends WitElement implements WitTypeHint {

    public WitTypeHintNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitTypeHint(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitTuple getTuple() {
        return findChildByClass(WitTuple.class);
    }

    @Override
    @Nullable
    public WitTypeGeneric getTypeGeneric() {
        return findChildByClass(WitTypeGeneric.class);
    }

}
