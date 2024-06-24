// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.MbtiDeclareClosure;
import com.github.moonbit.psi.MbtiDeclareParameter;
import com.github.moonbit.psi.MbtiFunctionBody;
import com.github.moonbit.psi.MbtiVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MbtiDeclareClosureNode extends AnyMbtiNode implements MbtiDeclareClosure {

    public MbtiDeclareClosureNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitDeclareClosure(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
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

}
