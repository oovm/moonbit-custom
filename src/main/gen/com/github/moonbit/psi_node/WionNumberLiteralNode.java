// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WionNumberLiteral;
import com.github.moonbit.psi.WionVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WionElement;

public class WionNumberLiteralNode extends WionElement implements WionNumberLiteral {

    public WionNumberLiteralNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WionVisitor visitor) {
        visitor.visitNumberLiteral(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WionVisitor) accept((WionVisitor) visitor);
        else super.accept(visitor);
    }

}
