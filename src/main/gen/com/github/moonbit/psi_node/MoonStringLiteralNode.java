// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.AnyMoonNode;
import com.github.moonbit.psi.MoonIdentifier;
import com.github.moonbit.psi.MoonStringLiteral;
import com.github.moonbit.psi.MoonVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class MoonStringLiteralNode extends AnyMoonNode implements MoonStringLiteral {

    public MoonStringLiteralNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitStringLiteral(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public MoonIdentifier getIdentifier() {
        return findNotNullChildByClass(MoonIdentifier.class);
    }

}
