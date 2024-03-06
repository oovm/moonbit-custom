// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MoonDeclareFunctionNode extends AnyMoonNode implements MoonDeclareFunction {

    public MoonDeclareFunctionNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitDeclareFunction(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonDeclareGeneric getDeclareGeneric() {
        return findChildByClass(MoonDeclareGeneric.class);
    }

    @Override
    @Nullable
    public MoonDeclareParameter getDeclareParameter() {
        return findChildByClass(MoonDeclareParameter.class);
    }

    @Override
    @Nullable
    public MoonFunctionBody getFunctionBody() {
        return findChildByClass(MoonFunctionBody.class);
    }

    @Override
    @Nullable
    public MoonIdentifier getIdentifier() {
        return findChildByClass(MoonIdentifier.class);
    }

    @Override
    @NotNull
    public List<MoonModifier> getModifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonModifier.class);
    }

}
