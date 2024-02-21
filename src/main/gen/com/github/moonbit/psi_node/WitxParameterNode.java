// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxIdentifier;
import com.github.moonbit.psi.WitxParameter;
import com.github.moonbit.psi.WitxTypeHint;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxParameterNode extends WitElement implements WitxParameter {

    public WitxParameterNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitParameter(this);
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
    @NotNull
    public WitxTypeHint getTypeHint() {
        return findNotNullChildByClass(WitxTypeHint.class);
    }

}
