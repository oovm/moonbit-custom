// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WitIdentifier;
import com.github.moonbit.psi.WitRecord;
import com.github.moonbit.psi.WitRecordField;
import com.github.moonbit.psi.WitVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.mixin.MixinRecord;

public class WitRecordNode extends MixinRecord implements WitRecord {

    public WitRecordNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitVisitor visitor) {
        visitor.visitRecord(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitVisitor) accept((WitVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitIdentifier getIdentifier() {
        return findChildByClass(WitIdentifier.class);
    }

    @Override
    @NotNull
    public List<WitRecordField> getRecordFieldList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WitRecordField.class);
    }

}
