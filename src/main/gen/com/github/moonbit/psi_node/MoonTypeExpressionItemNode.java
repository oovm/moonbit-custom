// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.github.moonbit.psi.MoonTypes.*;

import com.github.moonbit.psi.AnyMoonNode;
import com.github.moonbit.psi.*;

public class MoonTypeExpressionItemNode extends AnyMoonNode implements MoonTypeExpressionItem {

    public MoonTypeExpressionItemNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitTypeExpressionItem(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public MoonTypeExpressionAtom getTypeExpressionAtom() {
        return findNotNullChildByClass(MoonTypeExpressionAtom.class);
    }

    @Override
    @NotNull
    public List<MoonTypePrefix> getTypePrefixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonTypePrefix.class);
    }

    @Override
    @NotNull
    public List<MoonTypeSuffix> getTypeSuffixList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonTypeSuffix.class);
    }

}
