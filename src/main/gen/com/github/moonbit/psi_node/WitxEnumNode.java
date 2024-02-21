// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WitxEnum;
import com.github.moonbit.psi.WitxEnumItems;
import com.github.moonbit.psi.WitxTag;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxEnumNode extends WitElement implements WitxEnum {

    public WitxEnumNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitEnum(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<WitxEnumItems> getEnumItemsList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxEnumItems.class);
    }

    @Override
    @Nullable
    public WitxTag getTag() {
        return findChildByClass(WitxTag.class);
    }

}
