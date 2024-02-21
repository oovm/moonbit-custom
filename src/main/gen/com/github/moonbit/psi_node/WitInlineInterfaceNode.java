// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitInlineInterface;
import com.github.moonbit.psi.WitInterfaceBody;
import com.github.moonbit.psi.WitInterfaceName;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitInlineInterfaceNode extends WitElement implements WitInlineInterface {

    public WitInlineInterfaceNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitInlineInterface(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitInterfaceBody getInterfaceBody() {
        return findChildByClass(WitInterfaceBody.class);
    }

    @Override
    @NotNull
    public WitInterfaceName getInterfaceName() {
        return findNotNullChildByClass(WitInterfaceName.class);
    }

}
