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

public class MoonIfStatementNode extends AnyMoonNode implements MoonIfStatement {

    public MoonIfStatementNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitIfStatement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<MoonElseIf> getElseIfList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonElseIf.class);
    }

    @Override
    @Nullable
    public MoonElseStatement getElseStatement() {
        return findChildByClass(MoonElseStatement.class);
    }

    @Override
    @Nullable
    public MoonThenStatement getThenStatement() {
        return findChildByClass(MoonThenStatement.class);
    }

}
