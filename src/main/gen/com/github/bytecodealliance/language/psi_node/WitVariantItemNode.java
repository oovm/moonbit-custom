// This is a generated file. Not intended for manual editing.
package com.github.bytecodealliance.language.psi_node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.github.bytecodealliance.language.psi.WitTypes.*;

import com.github.bytecodealliance.language.mixin.MixinVariantItem;
import com.github.bytecodealliance.language.psi.*;

public class WitVariantItemNode extends MixinVariantItem implements WitVariantItem {

    public WitVariantItemNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitVariantItem(this);
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
    @Nullable
    public WitTypeHint getTypeHint() {
        return findChildByClass(WitTypeHint.class);
    }

}
