// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxFunction;
import com.github.moonbit.psi.WitxFunctionSignature;
import com.github.moonbit.psi.WitxIdentifier;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxFunctionNode extends WitElement implements WitxFunction {

    public WitxFunctionNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitFunction(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public WitxFunctionSignature getFunctionSignature() {
        return findNotNullChildByClass(WitxFunctionSignature.class);
    }

    @Override
    @NotNull
    public WitxIdentifier getIdentifier() {
        return findNotNullChildByClass(WitxIdentifier.class);
    }

}
