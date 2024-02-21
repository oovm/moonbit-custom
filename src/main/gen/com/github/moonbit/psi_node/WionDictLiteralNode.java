// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WionDictItem;
import com.github.moonbit.psi.WionDictLiteral;
import com.github.moonbit.psi.WionIdentifier;
import com.github.moonbit.psi.WionVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.psi.WionElement;

public class WionDictLiteralNode extends WionElement implements WionDictLiteral {

    public WionDictLiteralNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WionVisitor visitor) {
        visitor.visitDictLiteral(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WionVisitor) accept((WionVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<WionDictItem> getDictItemList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WionDictItem.class);
    }

    @Override
    @Nullable
    public WionIdentifier getIdentifier() {
        return findChildByClass(WionIdentifier.class);
    }

}
