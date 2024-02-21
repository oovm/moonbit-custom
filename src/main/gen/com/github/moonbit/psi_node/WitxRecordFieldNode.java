// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxRecordField;
import com.github.moonbit.psi.WitxReferenceName;
import com.github.moonbit.psi.WitxTypeHint;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxRecordFieldNode extends WitElement implements WitxRecordField {

    public WitxRecordFieldNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitRecordField(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitxReferenceName getReferenceName() {
        return findChildByClass(WitxReferenceName.class);
    }

    @Override
    @Nullable
    public WitxTypeHint getTypeHint() {
        return findChildByClass(WitxTypeHint.class);
    }

}
