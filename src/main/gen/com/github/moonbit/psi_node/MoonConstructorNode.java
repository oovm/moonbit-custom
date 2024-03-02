// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MoonConstructorNode extends AnyMoonNode implements MoonConstructor {

    public MoonConstructorNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitConstructor(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonTuple getTuple() {
        return findChildByClass(MoonTuple.class);
    }

    @Override
    @Nullable
    public MoonTypeHint getTypeHint() {
        return findChildByClass(MoonTypeHint.class);
    }

}
