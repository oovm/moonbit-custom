// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitGeneric;
import com.github.moonbit.psi.WitIdentifier;
import com.github.moonbit.psi.WitTypeGeneric;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitTypeGenericNode extends WitElement implements WitTypeGeneric {

    public WitTypeGenericNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitTypeGeneric(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitGeneric getGeneric() {
        return findChildByClass(WitGeneric.class);
    }

    @Override
    @NotNull
    public WitIdentifier getIdentifier() {
        return findNotNullChildByClass(WitIdentifier.class);
    }

}
