// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MoonDeclareStructNode extends AnyMoonNode implements MoonDeclareStruct {

    public MoonDeclareStructNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitDeclareStruct(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonDeriveStatement getDeriveStatement() {
        return findChildByClass(MoonDeriveStatement.class);
    }

    @Override
    @Nullable
    public MoonIdentifier getIdentifier() {
        return findChildByClass(MoonIdentifier.class);
    }

    @Override
    @Nullable
    public MoonStructBody getStructBody() {
        return findChildByClass(MoonStructBody.class);
    }

}
