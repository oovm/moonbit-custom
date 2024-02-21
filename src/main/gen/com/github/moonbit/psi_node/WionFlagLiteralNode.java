// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WionFlagItem;
import com.github.moonbit.psi.WionFlagLiteral;
import com.github.moonbit.psi.WionFlagSign;
import com.github.moonbit.psi.WionVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.psi.WionElement;

public class WionFlagLiteralNode extends WionElement implements WionFlagLiteral {

    public WionFlagLiteralNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WionVisitor visitor) {
        visitor.visitFlagLiteral(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WionVisitor) accept((WionVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<WionFlagItem> getFlagItemList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WionFlagItem.class);
    }

    @Override
    @NotNull
    public WionFlagSign getFlagSign() {
        return findNotNullChildByClass(WionFlagSign.class);
    }

}
