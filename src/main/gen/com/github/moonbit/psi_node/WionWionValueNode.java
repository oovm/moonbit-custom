// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WionElement;

public class WionWionValueNode extends WionElement implements WionWionValue {

    public WionWionValueNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WionVisitor visitor) {
        visitor.visitWionValue(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WionVisitor) accept((WionVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WionDictLiteral getDictLiteral() {
        return findChildByClass(WionDictLiteral.class);
    }

    @Override
    @Nullable
    public WionFlagLiteral getFlagLiteral() {
        return findChildByClass(WionFlagLiteral.class);
    }

    @Override
    @Nullable
    public WionListLiteral getListLiteral() {
        return findChildByClass(WionListLiteral.class);
    }

    @Override
    @Nullable
    public WionNumberLiteral getNumberLiteral() {
        return findChildByClass(WionNumberLiteral.class);
    }

    @Override
    @Nullable
    public WionOptionLiteral getOptionLiteral() {
        return findChildByClass(WionOptionLiteral.class);
    }

    @Override
    @Nullable
    public WionResultLiteral getResultLiteral() {
        return findChildByClass(WionResultLiteral.class);
    }

    @Override
    @Nullable
    public WionTextLiteral getTextLiteral() {
        return findChildByClass(WionTextLiteral.class);
    }

    @Override
    @Nullable
    public WionVariantLiteral getVariantLiteral() {
        return findChildByClass(WionVariantLiteral.class);
    }

}
