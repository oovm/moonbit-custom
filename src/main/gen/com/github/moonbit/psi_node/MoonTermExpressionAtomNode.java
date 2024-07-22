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

public class MoonTermExpressionAtomNode extends AnyMoonNode implements MoonTermExpressionAtom {

    public MoonTermExpressionAtomNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitTermExpressionAtom(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonIdentifier getIdentifier() {
        return findChildByClass(MoonIdentifier.class);
    }

    @Override
    @Nullable
    public MoonNumberLiteral getNumberLiteral() {
        return findChildByClass(MoonNumberLiteral.class);
    }

    @Override
    @Nullable
    public MoonStringLiteral getStringLiteral() {
        return findChildByClass(MoonStringLiteral.class);
    }

    @Override
    @Nullable
    public MoonTermExpression getTermExpression() {
        return findChildByClass(MoonTermExpression.class);
    }

}
