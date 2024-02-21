// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxReferenceName;
import com.github.moonbit.psi.WitxTypeHint;
import com.github.moonbit.psi.WitxTypename;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxTypenameNode extends WitElement implements WitxTypename {

    public WitxTypenameNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitTypename(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitxReferenceName getReferenceName() {
        return findChildByClass(WitxReferenceName.class);
    }

    @Override
    @Nullable
    public WitxTypeHint getTypeHint() {
        return findChildByClass(WitxTypeHint.class);
    }

}
