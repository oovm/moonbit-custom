// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.github.moonbit.psi_node.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface MbtiTypes {

    IElementType ALIAS_STATEMENT = new MoonElementType("ALIAS_STATEMENT");
    IElementType DECLARE_ENUM = new MoonElementType("DECLARE_ENUM");
    IElementType DECLARE_FIELD = new MoonElementType("DECLARE_FIELD");
    IElementType DECLARE_FUNCTION = new MoonElementType("DECLARE_FUNCTION");
    IElementType DECLARE_GENERIC = new MoonElementType("DECLARE_GENERIC");
    IElementType DECLARE_IMPL = new MoonElementType("DECLARE_IMPL");
    IElementType DECLARE_METHOD = new MoonElementType("DECLARE_METHOD");
    IElementType DECLARE_PACKAGE = new MoonElementType("DECLARE_PACKAGE");
    IElementType DECLARE_PARAMETER = new MoonElementType("DECLARE_PARAMETER");
    IElementType DECLARE_TRAIT = new MoonElementType("DECLARE_TRAIT");
    IElementType DECLARE_TYPE = new MoonElementType("DECLARE_TYPE");
    IElementType DECLARE_VARIANT = new MoonElementType("DECLARE_VARIANT");
    IElementType ENUM_BODY = new MoonElementType("ENUM_BODY");
    IElementType FUNCTION_BODY = new MoonElementType("FUNCTION_BODY");
    IElementType FUNCTION_ELEMENT = new MoonElementType("FUNCTION_ELEMENT");
    IElementType GENERIC_ITEM = new MoonElementType("GENERIC_ITEM");
    IElementType IDENTIFIER = new MoonElementType("IDENTIFIER");
    IElementType IMPL_BODY = new MoonElementType("IMPL_BODY");
    IElementType MODIFIER = new MoonElementType("MODIFIER");
    IElementType NUMBER_LITERAL = new MoonElementType("NUMBER_LITERAL");
    IElementType PACKAGE_PATH = new MoonElementType("PACKAGE_PATH");
    IElementType STRING_LITERAL = new MoonElementType("STRING_LITERAL");
    IElementType TRAIT_BODY = new MoonElementType("TRAIT_BODY");
    IElementType TYPE_EXPRESSION = new MoonElementType("TYPE_EXPRESSION");
    IElementType TYPE_EXPRESSION_ATOM = new MoonElementType("TYPE_EXPRESSION_ATOM");
    IElementType TYPE_EXPRESSION_ITEM = new MoonElementType("TYPE_EXPRESSION_ITEM");
    IElementType TYPE_INFIX = new MoonElementType("TYPE_INFIX");
    IElementType TYPE_PREFIX = new MoonElementType("TYPE_PREFIX");
    IElementType TYPE_SUFFIX = new MoonElementType("TYPE_SUFFIX");

    IElementType ACCENT = new MoonTokenType("^");
    IElementType ANGLE_L = new MoonTokenType("<");
    IElementType ANGLE_R = new MoonTokenType(">");
    IElementType AT = new MoonTokenType("@");
    IElementType BRACE_L = new MoonTokenType("{");
    IElementType BRACE_R = new MoonTokenType("}");
    IElementType BRACKET_L = new MoonTokenType("[");
    IElementType BRACKET_R = new MoonTokenType("]");
    IElementType COLON = new MoonTokenType(":");
    IElementType COMMA = new MoonTokenType(",");
    IElementType COMMENT_BLOCK = new MoonTokenType("Comment Block");
    IElementType COMMENT_DOCUMENT = new MoonTokenType("Comment Document");
    IElementType COMMENT_LINE = new MoonTokenType("Comment");
    IElementType CONSTRUCTOR = new MoonTokenType("constructor");
    IElementType DECLARE_TEST = new MoonTokenType("declare-test");
    IElementType DOLLAR = new MoonTokenType("$");
    IElementType DOT = new MoonTokenType(".");
    IElementType DOUBLE_QUOTE_L = new MoonTokenType("DOUBLE_QUOTE_L");
    IElementType DOUBLE_QUOTE_R = new MoonTokenType("DOUBLE_QUOTE_R");
    IElementType EQ = new MoonTokenType("=");
    IElementType ESCAPED = new MoonTokenType("ESCAPED");
    IElementType FUNCTION_SIGNATURE = new MoonTokenType("function-signature");
    IElementType HYPHEN = new MoonTokenType("-");
    IElementType IF_STATEMENT = new MoonTokenType("if-statement");
    IElementType INTEGER = new MoonTokenType("INTEGER");
    IElementType KW_ALIAS = new MoonTokenType("KW_ALIAS");
    IElementType KW_ENUM = new MoonTokenType("KW_ENUM");
    IElementType KW_FN = new MoonTokenType("KW_FN");
    IElementType KW_IMPL = new MoonTokenType("KW_IMPL");
    IElementType KW_PACKAGE = new MoonTokenType("KW_PACKAGE");
    IElementType KW_PRIVATE = new MoonTokenType("KW_PRIVATE");
    IElementType KW_PUBLIC = new MoonTokenType("KW_PUBLIC");
    IElementType KW_TRAIT = new MoonTokenType("KW_TRAIT");
    IElementType KW_TYPE = new MoonTokenType("KW_TYPE");
    IElementType OP_ADD = new MoonTokenType("OP_ADD");
    IElementType OP_DIV = new MoonTokenType("OP_DIV");
    IElementType OP_TO = new MoonTokenType("OP_TO");
    IElementType PARENTHESIS_L = new MoonTokenType("(");
    IElementType PARENTHESIS_R = new MoonTokenType(")");
    IElementType PLACE_HOLDER = new MoonTokenType("_");
    IElementType SEMICOLON = new MoonTokenType(";");
    IElementType SLASH = new MoonTokenType("/");
    IElementType STAR = new MoonTokenType("*");
    IElementType STRING_TEXT = new MoonTokenType("STRING_TEXT");
    IElementType SYMBOL = new MoonTokenType("SYMBOL");
    IElementType TO = new MoonTokenType("->");
    IElementType TYPE_HINT = new MoonTokenType("type-hint");
    IElementType WHILE_STATEMENT = new MoonTokenType("while-statement");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == ALIAS_STATEMENT) {
                return new MbtiAliasStatementNode(node);
            } else if (type == DECLARE_ENUM) {
                return new MbtiDeclareEnumNode(node);
            } else if (type == DECLARE_FIELD) {
                return new MbtiDeclareFieldNode(node);
            } else if (type == DECLARE_FUNCTION) {
                return new MbtiDeclareFunctionNode(node);
            } else if (type == DECLARE_GENERIC) {
                return new MbtiDeclareGenericNode(node);
            } else if (type == DECLARE_IMPL) {
                return new MbtiDeclareImplNode(node);
            } else if (type == DECLARE_METHOD) {
                return new MbtiDeclareMethodNode(node);
            } else if (type == DECLARE_PACKAGE) {
                return new MbtiDeclarePackageNode(node);
            } else if (type == DECLARE_PARAMETER) {
                return new MbtiDeclareParameterNode(node);
            } else if (type == DECLARE_TRAIT) {
                return new MbtiDeclareTraitNode(node);
            } else if (type == DECLARE_TYPE) {
                return new MbtiDeclareTypeNode(node);
            } else if (type == DECLARE_VARIANT) {
                return new MbtiDeclareVariantNode(node);
            } else if (type == ENUM_BODY) {
                return new MbtiEnumBodyNode(node);
            } else if (type == FUNCTION_BODY) {
                return new MbtiFunctionBodyNode(node);
            } else if (type == FUNCTION_ELEMENT) {
                return new MbtiFunctionElementNode(node);
            } else if (type == GENERIC_ITEM) {
                return new MbtiGenericItemNode(node);
            } else if (type == IDENTIFIER) {
                return new MbtiIdentifierNode(node);
            } else if (type == IMPL_BODY) {
                return new MbtiImplBodyNode(node);
            } else if (type == MODIFIER) {
                return new MbtiModifierNode(node);
            } else if (type == NUMBER_LITERAL) {
                return new MbtiNumberLiteralNode(node);
            } else if (type == PACKAGE_PATH) {
                return new MbtiPackagePathNode(node);
            } else if (type == STRING_LITERAL) {
                return new MbtiStringLiteralNode(node);
            } else if (type == TRAIT_BODY) {
                return new MbtiTraitBodyNode(node);
            } else if (type == TYPE_EXPRESSION) {
                return new MbtiTypeExpressionNode(node);
            } else if (type == TYPE_EXPRESSION_ATOM) {
                return new MbtiTypeExpressionAtomNode(node);
            } else if (type == TYPE_EXPRESSION_ITEM) {
                return new MbtiTypeExpressionItemNode(node);
            } else if (type == TYPE_INFIX) {
                return new MbtiTypeInfixNode(node);
            } else if (type == TYPE_PREFIX) {
                return new MbtiTypePrefixNode(node);
            } else if (type == TYPE_SUFFIX) {
                return new MbtiTypeSuffixNode(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
