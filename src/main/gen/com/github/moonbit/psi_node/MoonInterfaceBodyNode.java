// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static com.github.moonbit.psi.MoonTypes.*;

import com.github.moonbit.psi.WitElement;
import com.github.moonbit.psi.*;

public class MoonInterfaceBodyNode extends WitElement implements MoonInterfaceBody {

    public MoonInterfaceBodyNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitInterfaceBody(this);
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
    public List<MoonFlags> getFlagsList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonFlags.class);
    }

    @Override
    @NotNull
    public List<MoonFunction> getFunctionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonFunction.class);
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
