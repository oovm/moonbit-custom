// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi_node;

import com.github.moonbit.psi.WitxInclude;
import com.github.moonbit.psi.WitxIncludeName;
import com.github.moonbit.psi.WitxVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;

import com.github.bytecodealliance.language.psi.WitElement;

public class WitxIncludeNode extends WitElement implements WitxInclude {

    public WitxIncludeNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull WitxVisitor visitor) {
        visitor.visitInclude(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof WitxVisitor) accept((WitxVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public WitxIncludeName getIncludeName() {
        return findChildByClass(WitxIncludeName.class);
    }

}
