// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MoonWorldNode extends MoonElement implements MoonWorld {

    public MoonWorldNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitWorld(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<MoonDefineType> getDefineTypeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonDefineType.class);
    }

    @Override
    @NotNull
    public List<MoonEnum> getEnumList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonEnum.class);
    }

    @Override
    @NotNull
    public List<MoonExport> getExportList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonExport.class);
    }

    @Override
    @Nullable
    public MoonIdentifier getIdentifier() {
        return findChildByClass(MoonIdentifier.class);
    }

    @Override
    @NotNull
    public List<MoonImport> getImportList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonImport.class);
    }

    @Override
    @NotNull
    public List<MoonInclude> getIncludeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonInclude.class);
    }

    @Override
    @Nullable
    public MoonModifier getModifier() {
        return findChildByClass(MoonModifier.class);
    }

    @Override
    @NotNull
    public List<MoonRecord> getRecordList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonRecord.class);
    }

    @Override
    @NotNull
    public List<MoonResource> getResourceList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonResource.class);
    }

    @Override
    @NotNull
    public List<MoonUse> getUseList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonUse.class);
    }

    @Override
    @NotNull
    public List<MoonVariant> getVariantList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonVariant.class);
    }

}
