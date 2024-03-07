// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.AnyMoonNode;
import com.github.moonbit.psi.MoonTermPrefix;
import com.github.moonbit.psi.MoonTermSuffix;
import com.github.moonbit.psi.MoonVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MoonTermExpressionNodeNode extends AnyMoonNode implements MoonTermExpressionNode {

    public MoonTermExpressionNodeNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitTermExpressionNode(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<MoonTermPrefix> getTermPrefixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonTermPrefix.class);
    }

    @Override
    @NotNull
    public List<MoonTermSuffix> getTermSuffixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonTermSuffix.class);
    }

}
