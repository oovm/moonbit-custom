// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.AnyMbtiNode;
import com.github.moonbit.psi.MbtiMatchBody;
import com.github.moonbit.psi.MbtiMatchVariant;
import com.github.moonbit.psi.MbtiVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MbtiMatchBodyNode extends AnyMbtiNode implements MbtiMatchBody {

    public MbtiMatchBodyNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitMatchBody(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<MbtiMatchVariant> getMatchVariantList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MbtiMatchVariant.class);
    }

}