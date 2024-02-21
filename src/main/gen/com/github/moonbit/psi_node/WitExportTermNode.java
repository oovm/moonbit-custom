// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitExportTermNode extends WitElement implements WitExportTerm {

    public WitExportTermNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitExportTerm(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitFunction getFunction() {
        return findChildByClass(WitFunction.class);
    }

    @Override
    @Nullable
    public WitIncludeName getIncludeName() {
        return findChildByClass(WitIncludeName.class);
    }

    @Override
    @Nullable
    public WitInlineInterface getInlineInterface() {
        return findChildByClass(WitInlineInterface.class);
    }

}
