// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WitModuleName;
import com.github.moonbit.psi.WitPackageName;
import com.github.moonbit.psi.WitPackageVersion;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitPackageNameNode extends WitElement implements WitPackageName {

    public WitPackageNameNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitPackageName(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<WitModuleName> getModuleNameList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WitModuleName.class);
    }

    @Override
    @Nullable
    public WitPackageVersion getPackageVersion() {
        return findChildByClass(WitPackageVersion.class);
    }

}
