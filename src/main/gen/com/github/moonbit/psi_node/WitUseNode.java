// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitIncludeName;
import com.github.moonbit.psi.WitUse;
import com.github.moonbit.psi.WitUseItems;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitUseNode extends WitElement implements WitUse {

    public WitUseNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitUse(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitIncludeName getIncludeName() {
        return findChildByClass(WitIncludeName.class);
    }

    @Override
    @Nullable
    public WitUseItems getUseItems() {
        return findChildByClass(WitUseItems.class);
    }

}
