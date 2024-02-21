// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxIdentifier;
import com.github.moonbit.psi.WitxTag;
import com.github.moonbit.psi.WitxTypeHint;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxTagNode extends WitElement implements WitxTag {

    public WitxTagNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitTag(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitxIdentifier getIdentifier() {
        return findChildByClass(WitxIdentifier.class);
    }

    @Override
    @Nullable
    public WitxTypeHint getTypeHint() {
        return findChildByClass(WitxTypeHint.class);
    }

}
