// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WionDictKey;
import com.github.moonbit.psi.WionIdentifier;
import com.github.moonbit.psi.WionTextLiteral;
import com.github.moonbit.psi.WionVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WionElement;

public class WionDictKeyNode extends WionElement implements WionDictKey {

    public WionDictKeyNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WionVisitor visitor) {
        visitor.visitDictKey(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WionVisitor) accept((WionVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WionIdentifier getIdentifier() {
        return findChildByClass(WionIdentifier.class);
    }

    @Override
    @Nullable
    public WionTextLiteral getTextLiteral() {
        return findChildByClass(WionTextLiteral.class);
    }

}
