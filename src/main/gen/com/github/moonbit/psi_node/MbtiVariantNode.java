// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.MbtiIdentifier;
import com.github.moonbit.psi.MbtiVariant;
import com.github.moonbit.psi.MbtiVariantItem;
import com.github.moonbit.psi.MbtiVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MbtiVariantNode extends AnyMbtiNode implements MbtiVariant {

    public MbtiVariantNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitVariant(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiIdentifier getIdentifier() {
        return findChildByClass(MbtiIdentifier.class);
    }

    @Override
    @NotNull
    public List<MbtiVariantItem> getVariantItemList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MbtiVariantItem.class);
    }

}
