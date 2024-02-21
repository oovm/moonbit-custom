// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.*;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitIncludeNameNode extends WitElement implements WitIncludeName {

    public WitIncludeNameNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitIncludeName(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<WitIdentifier> getIdentifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WitIdentifier.class);
    }

    @Override
    @NotNull
    public WitInterfaceName getInterfaceName() {
        return findNotNullChildByClass(WitInterfaceName.class);
    }

    @Override
    @Nullable
    public WitPackageVersion getPackageVersion() {
        return findChildByClass(WitPackageVersion.class);
    }

}
