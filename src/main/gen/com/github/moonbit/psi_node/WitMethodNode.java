// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitFunctionSignature;
import com.github.moonbit.psi.WitIdentifier;
import com.github.moonbit.psi.WitMethod;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.mixin.MixinMethod;

public class WitMethodNode extends MixinMethod implements WitMethod {

    public WitMethodNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitMethod(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public WitFunctionSignature getFunctionSignature() {
        return findNotNullChildByClass(WitFunctionSignature.class);
    }

    @Override
    @NotNull
    public WitIdentifier getIdentifier() {
        return findNotNullChildByClass(WitIdentifier.class);
    }

}
