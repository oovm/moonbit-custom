// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import java.util.List;

import com.github.moonbit.psi.WitxFunctionParameters;
import com.github.moonbit.psi.WitxParameter;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxFunctionParametersNode extends WitElement implements WitxFunctionParameters {

    public WitxFunctionParametersNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitFunctionParameters(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<WitxParameter> getParameterList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, WitxParameter.class);
    }

}
