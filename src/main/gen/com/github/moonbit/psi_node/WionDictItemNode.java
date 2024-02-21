// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WionDictItem;
import com.github.moonbit.psi.WionDictKey;
import com.github.moonbit.psi.WionVisitor;
import com.github.moonbit.psi.WionWionValue;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WionElement;

public class WionDictItemNode extends WionElement implements WionDictItem {

    public WionDictItemNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WionVisitor visitor) {
        visitor.visitDictItem(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WionVisitor) accept((WionVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WionDictKey getDictKey() {
        return findChildByClass(WionDictKey.class);
    }

    @Override
    @Nullable
    public WionWionValue getWionValue() {
        return findChildByClass(WionWionValue.class);
    }

}
