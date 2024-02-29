// This is a generated file. Not intended for manual editing.
package com.github.moonbit.psi;

import com.github.moonbit.psi_node.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface MoonTypes {

    IElementType ALIAS_NAME = new MoonElementType("ALIAS_NAME");
    IElementType CONSTRUCTOR = new MoonElementType("CONSTRUCTOR");
    IElementType DEFINE_INTERFACE = new MoonElementType("DEFINE_INTERFACE");
    IElementType DEFINE_TYPE = new MoonElementType("DEFINE_TYPE");
    IElementType ENUM = new MoonElementType("ENUM");
    IElementType EXPORT = new MoonElementType("EXPORT");
    IElementType EXPORT_TERM = new MoonElementType("EXPORT_TERM");
    IElementType FLAGS = new MoonElementType("FLAGS");
    IElementType FUNCTION = new MoonElementType("FUNCTION");
    IElementType FUNCTION_SIGNATURE = new MoonElementType("FUNCTION_SIGNATURE");
    IElementType GENERIC = new MoonElementType("GENERIC");
    IElementType IDENTIFIER = new MoonElementType("IDENTIFIER");
    IElementType IMPORT = new MoonElementType("IMPORT");
    IElementType INCLUDE = new MoonElementType("INCLUDE");
    IElementType INCLUDE_NAME = new MoonElementType("INCLUDE_NAME");
    IElementType INLINE_INTERFACE = new MoonElementType("INLINE_INTERFACE");
    IElementType INTERFACE_BODY = new MoonElementType("INTERFACE_BODY");
    IElementType INTERFACE_NAME = new MoonElementType("INTERFACE_NAME");
    IElementType METHOD = new MoonElementType("METHOD");
    IElementType MODIFIER = new MoonElementType("MODIFIER");
    IElementType MODULE_NAME = new MoonElementType("MODULE_NAME");
    IElementType PACKAGE = new MoonElementType("PACKAGE");
    IElementType PACKAGE_NAME = new MoonElementType("PACKAGE_NAME");
    IElementType PACKAGE_VERSION = new MoonElementType("PACKAGE_VERSION");
    IElementType PARAMETER = new MoonElementType("PARAMETER");
    IElementType RECORD = new MoonElementType("RECORD");
    IElementType RECORD_FIELD = new MoonElementType("RECORD_FIELD");
    IElementType RESOURCE = new MoonElementType("RESOURCE");
    IElementType SEMANTIC_NUMBER = new MoonElementType("SEMANTIC_NUMBER");
    IElementType TUPLE = new MoonElementType("TUPLE");
    IElementType TYPE_GENERIC = new MoonElementType("TYPE_GENERIC");
    IElementType TYPE_HINT = new MoonElementType("TYPE_HINT");
    IElementType USE = new MoonElementType("USE");
    IElementType USE_ALIAS = new MoonElementType("USE_ALIAS");
    IElementType USE_ITEMS = new MoonElementType("USE_ITEMS");
    IElementType VARIANT = new MoonElementType("VARIANT");
    IElementType VARIANT_ITEM = new MoonElementType("VARIANT_ITEM");
    IElementType WORLD = new MoonElementType("WORLD");

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
    IElementType COMMENT = new MoonTokenType("Comment");
    IElementType COMMENT_BLOCK = new MoonTokenType("Comment Block");
    IElementType COMMENT_DOCUMENT = new MoonTokenType("Comment Document");
    IElementType COMMENT_LINE = new MoonTokenType("COMMENT_LINE");
    IElementType DOLLAR = new MoonTokenType("$");
    IElementType DOT = new MoonTokenType(".");
    IElementType EQ = new MoonTokenType("=");
    IElementType ESCAPED = new MoonTokenType("ESCAPED");
    IElementType HYPHEN = new MoonTokenType("-");
    IElementType KW_AS = new MoonTokenType("as");
    IElementType KW_CONSTRUCTOR = new MoonTokenType("constructor");
    IElementType KW_ENUM = new MoonTokenType("enum");
    IElementType KW_EXPORT = new MoonTokenType("export");
    IElementType KW_FLAGS = new MoonTokenType("flags");
    IElementType KW_FUNCTION = new MoonTokenType("func");
    IElementType KW_IMPORT = new MoonTokenType("import");
    IElementType KW_INCLUDE = new MoonTokenType("include");
    IElementType KW_INTERFACE = new MoonTokenType("interface");
    IElementType KW_PACKAGE = new MoonTokenType("package");
    IElementType KW_RECORD = new MoonTokenType("record");
    IElementType KW_RESOURCE = new MoonTokenType("resource");
    IElementType KW_TYPE = new MoonTokenType("type");
    IElementType KW_USE = new MoonTokenType("use");
    IElementType KW_VARIANT = new MoonTokenType("variant");
    IElementType KW_WORLD = new MoonTokenType("world");
    IElementType PARENTHESIS_L = new MoonTokenType("(");
    IElementType PARENTHESIS_R = new MoonTokenType(")");
    IElementType PLACE_HOLDER = new MoonTokenType("_");
    IElementType REFERENCE = new MoonTokenType("$Symbol");
    IElementType SELECTION_LINE = new MoonTokenType("SELECTION_LINE");
    IElementType SEMICOLON = new MoonTokenType(";");
    IElementType SLASH = new MoonTokenType("/");
    IElementType STAR = new MoonTokenType("*");
    IElementType STRING_CHAR = new MoonTokenType("String Character");
    IElementType STRING_ESCAPE = new MoonTokenType("String Escaped");
    IElementType STRING_QUOTE = new MoonTokenType("String Quote");
    IElementType SYMBOL = new MoonTokenType("Symbol");
    IElementType TO = new MoonTokenType("->");
    IElementType URL = new MoonTokenType("Url");
    IElementType VERSION = new MoonTokenType("<<semver>>");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == ALIAS_NAME) {
                return new MoonAliasNameNode(node);
            } else if (type == CONSTRUCTOR) {
                return new MoonConstructorNode(node);
            } else if (type == DEFINE_INTERFACE) {
                return new MoonDefineInterfaceNode(node);
            } else if (type == DEFINE_TYPE) {
                return new MoonDefineTypeNode(node);
            } else if (type == ENUM) {
                return new MoonEnumNode(node);
            } else if (type == EXPORT) {
                return new MoonExportNode(node);
            } else if (type == EXPORT_TERM) {
                return new MoonExportTermNode(node);
            } else if (type == FLAGS) {
                return new MoonFlagsNode(node);
            } else if (type == FUNCTION) {
                return new MoonFunctionNode(node);
            } else if (type == FUNCTION_SIGNATURE) {
                return new MoonFunctionSignatureNode(node);
            } else if (type == GENERIC) {
                return new MoonGenericNode(node);
            } else if (type == IDENTIFIER) {
                return new MoonIdentifierNode(node);
            } else if (type == IMPORT) {
                return new MoonImportNode(node);
            } else if (type == INCLUDE) {
                return new MoonIncludeNode(node);
            } else if (type == INCLUDE_NAME) {
                return new MoonIncludeNameNode(node);
            } else if (type == INLINE_INTERFACE) {
                return new MoonInlineInterfaceNode(node);
            } else if (type == INTERFACE_BODY) {
                return new MoonInterfaceBodyNode(node);
            } else if (type == INTERFACE_NAME) {
                return new MoonInterfaceNameNode(node);
            } else if (type == METHOD) {
                return new MoonMethodNode(node);
            } else if (type == MODIFIER) {
                return new MoonModifierNode(node);
            } else if (type == MODULE_NAME) {
                return new MoonModuleNameNode(node);
            } else if (type == PACKAGE) {
                return new MoonPackageNode(node);
            } else if (type == PACKAGE_NAME) {
                return new MoonPackageNameNode(node);
            } else if (type == PACKAGE_VERSION) {
                return new MoonPackageVersionNode(node);
            } else if (type == PARAMETER) {
                return new MoonParameterNode(node);
            } else if (type == RECORD) {
                return new MoonRecordNode(node);
            } else if (type == RECORD_FIELD) {
                return new MoonRecordFieldNode(node);
            } else if (type == RESOURCE) {
                return new MoonResourceNode(node);
            } else if (type == SEMANTIC_NUMBER) {
                return new MoonSemanticNumberNode(node);
            } else if (type == TUPLE) {
                return new MoonTupleNode(node);
            } else if (type == TYPE_GENERIC) {
                return new MoonTypeGenericNode(node);
            } else if (type == TYPE_HINT) {
                return new MoonTypeHintNode(node);
            } else if (type == USE) {
                return new MoonUseNode(node);
            } else if (type == USE_ALIAS) {
                return new MoonUseAliasNode(node);
            } else if (type == USE_ITEMS) {
                return new MoonUseItemsNode(node);
            } else if (type == VARIANT) {
                return new MoonVariantNode(node);
            } else if (type == VARIANT_ITEM) {
                return new MoonVariantItemNode(node);
            } else if (type == WORLD) {
                return new MoonWorldNode(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
