// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MoonUseAliasNode extends AnyMoonNode implements MoonUseAlias {

    public MoonUseAliasNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitUseAlias(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonAliasName getAliasName() {
        return findChildByClass(MoonAliasName.class);
    }

    @Override
    @NotNull
    public MoonIdentifier getIdentifier() {
        return findNotNullChildByClass(MoonIdentifier.class);
    }

}
