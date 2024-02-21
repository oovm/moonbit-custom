// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WitIdentifier;
import com.github.moonbit.psi.WitVariant;
import com.github.moonbit.psi.WitVariantItem;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.mixin.MixinVariant;

public class WitVariantNode extends MixinVariant implements WitVariant {

    public WitVariantNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitVariant(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitIdentifier getIdentifier() {
        return findChildByClass(WitIdentifier.class);
    }

    @Override
    @NotNull
    public List<WitVariantItem> getVariantItemList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WitVariantItem.class);
    }

}
