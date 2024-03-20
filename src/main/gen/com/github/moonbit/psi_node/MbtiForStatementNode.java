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

public class MbtiForStatementNode extends AnyMbtiNode implements MbtiForStatement {

    public MbtiForStatementNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitForStatement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public MbtiForCondition getForCondition() {
        return findNotNullChildByClass(MbtiForCondition.class);
    }

    @Override
    @NotNull
    public MbtiForIncrement getForIncrement() {
        return findNotNullChildByClass(MbtiForIncrement.class);
    }

    @Override
    @NotNull
    public MbtiForStartup getForStartup() {
        return findNotNullChildByClass(MbtiForStartup.class);
    }

    @Override
    @NotNull
    public MbtiFunctionBody getFunctionBody() {
        return findNotNullChildByClass(MbtiFunctionBody.class);
    }

}
