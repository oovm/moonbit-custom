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

public class MoonDefineInterfaceNode extends WitElement implements MoonDefineInterface {

    public MoonDefineInterfaceNode(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull MoonVisitor visitor) {
        visitor.visitDefineInterface(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof MoonVisitor) accept((MoonVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public MoonInterfaceBody getInterfaceBody() {
        return findChildByClass(MoonInterfaceBody.class);
    }

    @Override
    @Nullable
    public MoonInterfaceName getInterfaceName() {
        return findChildByClass(MoonInterfaceName.class);
    }

}
