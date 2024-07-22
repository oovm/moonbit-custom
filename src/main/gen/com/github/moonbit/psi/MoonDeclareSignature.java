// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MoonDeclareSignature extends PsiElement {

  @Nullable
  MoonDeclareGeneric getDeclareGeneric();

  @NotNull
  MoonIdentifier getIdentifier();

  @Nullable
  MoonModifier getModifier();

  @Nullable
  MoonReturnType getReturnType();

  @NotNull
  MoonSignatureParameter getSignatureParameter();

}
