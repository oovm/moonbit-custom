// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxIdentifier;
import com.github.moonbit.psi.WitxTypeHint;
import com.github.moonbit.psi.WitxVariantItem;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxVariantItemNode extends WitElement implements WitxVariantItem {

    public WitxVariantItemNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitVariantItem(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public WitxIdentifier getIdentifier() {
        return findNotNullChildByClass(WitxIdentifier.class);
    }

    @Override
    @Nullable
    public WitxTypeHint getTypeHint() {
        return findChildByClass(WitxTypeHint.class);
    }

}
