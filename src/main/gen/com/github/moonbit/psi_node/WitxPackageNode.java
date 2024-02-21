// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxPackage;
import com.github.moonbit.psi.WitxPackageName;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxPackageNode extends WitElement implements WitxPackage {

    public WitxPackageNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitPackage(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitxPackageName getPackageName() {
        return findChildByClass(WitxPackageName.class);
    }

}
