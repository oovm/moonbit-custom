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

public class MbtiTermSuffixNode extends AnyMbtiNode implements MbtiTermSuffix {

    public MbtiTermSuffixNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitTermSuffix(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiCallField getCallField() {
        return findChildByClass(MbtiCallField.class);
    }

    @Override
    @Nullable
    public MbtiCallFunction getCallFunction() {
        return findChildByClass(MbtiCallFunction.class);
    }

    @Override
    @Nullable
    public MbtiCallIndex getCallIndex() {
        return findChildByClass(MbtiCallIndex.class);
    }

    @Override
    @Nullable
    public MbtiCallMethod getCallMethod() {
        return findChildByClass(MbtiCallMethod.class);
    }

}
