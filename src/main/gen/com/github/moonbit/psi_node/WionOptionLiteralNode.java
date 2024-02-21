// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WionOptionLiteral;
import com.github.moonbit.psi.WionVisitor;
import com.github.moonbit.psi.WionWionValue;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WionElement;

public class WionOptionLiteralNode extends WionElement implements WionOptionLiteral {

    public WionOptionLiteralNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WionVisitor visitor) {
        visitor.visitOptionLiteral(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WionVisitor) accept((WionVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WionWionValue getWionValue() {
        return findChildByClass(WionWionValue.class);
    }

}
