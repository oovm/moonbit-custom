// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.moonbit.psi.MoonTypes.*;
import com.github.moonbit.psi.AnyMoonNode;
import com.github.moonbit.psi.*;

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
    public MoonDeclareParameters getDeclareParameters() {
        return findChildByClass(MoonDeclareParameters.class);
    }

    @Override
    @Nullable
    public MoonFunctionBody getFunctionBody() {
        return findChildByClass(MoonFunctionBody.class);
    }

    @Override
    @Nullable
    public MoonFunctionExtern getFunctionExtern() {
        return findChildByClass(MoonFunctionExtern.class);
    }

    @Override
    @Nullable
    public MoonFunctionInline getFunctionInline() {
        return findChildByClass(MoonFunctionInline.class);
    }

    @Override
    @NotNull
    public MoonFunctionName getFunctionName() {
        return findNotNullChildByClass(MoonFunctionName.class);
    }

    @Override
    @NotNull
    public List<MoonModifier> getModifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonModifier.class);
    }

    @Override
    @Nullable
    public MoonReturnType getReturnType() {
        return findChildByClass(MoonReturnType.class);
    }

}
