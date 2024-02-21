// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxIncludeName;
import com.github.moonbit.psi.WitxUse;
import com.github.moonbit.psi.WitxUseItems;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxUseNode extends WitElement implements WitxUse {

    public WitxUseNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitUse(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitxIncludeName getIncludeName() {
        return findChildByClass(WitxIncludeName.class);
    }

    @Override
    @Nullable
    public WitxUseItems getUseItems() {
        return findChildByClass(WitxUseItems.class);
    }

}
