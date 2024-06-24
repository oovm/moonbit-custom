// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.AnyMbtiNode;
import com.github.moonbit.psi.MbtiExport;
import com.github.moonbit.psi.MbtiExportTerm;
import com.github.moonbit.psi.MbtiVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MbtiExportNode extends AnyMbtiNode implements MbtiExport {

    public MbtiExportNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MbtiVisitor visitor) {
        visitor.visitExport(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MbtiVisitor) accept((MbtiVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MbtiExportTerm getExportTerm() {
        return findChildByClass(MbtiExportTerm.class);
    }

}
