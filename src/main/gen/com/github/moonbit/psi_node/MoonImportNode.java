// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.AnyMoonNode;
import com.github.moonbit.psi.MoonExportTerm;
import com.github.moonbit.psi.MoonImport;
import com.github.moonbit.psi.MoonVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MoonImportNode extends AnyMoonNode implements MoonImport {

    public MoonImportNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitImport(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonExportTerm getExportTerm() {
        return findChildByClass(MoonExportTerm.class);
    }

}
