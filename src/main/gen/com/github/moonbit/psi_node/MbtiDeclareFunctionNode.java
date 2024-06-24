// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.github.moonbit.psi.MbtiTypes.*;

import com.github.moonbit.psi.AnyMbtiNode;
import com.github.moonbit.psi.*;

public class MbtiDeclareFunctionNode extends AnyMbtiNode implements MbtiDeclareFunction {

    public MbtiDeclareFunctionNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitDeclareFunction(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiDeclareGeneric getDeclareGeneric() {
        return findChildByClass(MbtiDeclareGeneric.class);
    }

    @Override
    @Nullable
    public MbtiDeclareParameter getDeclareParameter() {
        return findChildByClass(MbtiDeclareParameter.class);
    }

    @Override
    @Nullable
    public MbtiFunctionBody getFunctionBody() {
        return findChildByClass(MbtiFunctionBody.class);
    }

    @Override
    @NotNull
    public MbtiIdentifier getIdentifier() {
        return findNotNullChildByClass(MbtiIdentifier.class);
    }

    @Override
    @NotNull
    public List<MbtiModifier> getModifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MbtiModifier.class);
    }

}
