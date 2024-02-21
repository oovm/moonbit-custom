// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitDefineType;
import com.github.moonbit.psi.WitIdentifier;
import com.github.moonbit.psi.WitTypeHint;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitDefineTypeNode extends WitElement implements WitDefineType {

    public WitDefineTypeNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitDefineType(this);
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
    @Nullable
    public WitTypeHint getTypeHint() {
        return findChildByClass(WitTypeHint.class);
    }

}
