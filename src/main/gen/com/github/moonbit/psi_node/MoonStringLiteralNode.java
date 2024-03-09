// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MoonStringLiteralNode extends AnyMoonNode implements MoonStringLiteral {

    public MoonStringLiteralNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitStringLiteral(this);
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
    public List<MoonStructStatement> getStructStatementList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonStructStatement.class);
    }

    @Override
    @NotNull
    public List<MoonVariant> getVariantList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonVariant.class);
    }

    @Override
    @NotNull
    public List<MoonWhileStatement> getWhileStatementList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, MoonWhileStatement.class);
    }

}
