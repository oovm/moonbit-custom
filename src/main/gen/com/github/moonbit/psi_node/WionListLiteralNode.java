// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WionListItem;
import com.github.moonbit.psi.WionListLiteral;
import com.github.moonbit.psi.WionVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.psi.WionElement;

public class WionListLiteralNode extends WionElement implements WionListLiteral {

    public WionListLiteralNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WionVisitor visitor) {
        visitor.visitListLiteral(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WionVisitor) accept((WionVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<WionListItem> getListItemList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WionListItem.class);
    }

}
