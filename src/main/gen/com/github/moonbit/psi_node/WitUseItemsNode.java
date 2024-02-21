// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WitUseAlias;
import com.github.moonbit.psi.WitUseItems;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitUseItemsNode extends WitElement implements WitUseItems {

    public WitUseItemsNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitUseItems(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<WitUseAlias> getUseAliasList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WitUseAlias.class);
    }

}
