// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitIdentifier;
import com.github.moonbit.psi.WitParameter;
import com.github.moonbit.psi.WitTypeHint;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitParameterNode extends WitElement implements WitParameter {

    public WitParameterNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitParameter(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public WitIdentifier getIdentifier() {
        return findNotNullChildByClass(WitIdentifier.class);
    }

    @Override
    @NotNull
    public WitTypeHint getTypeHint() {
        return findNotNullChildByClass(WitTypeHint.class);
    }

}
