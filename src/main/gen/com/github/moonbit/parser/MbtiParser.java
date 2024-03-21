// This is a generated file. Not intended for manual editing.
package com.github.moonbit.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.github.moonbit.psi.MbtiTypes.*;
import static com.github.moonbit.psi.MoonParserExtension.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MbtiParser implements PsiParser, LightPsiParser {

    public ASTNode parse(IElementType t, PsiBuilder b) {
        parseLight(t, b);
        return b.getTreeBuilt();
    }

    public void parseLight(IElementType t, PsiBuilder b) {
        boolean r;
        b = adapt_builder_(t, b, this, null);
        Marker m = enter_section_(b, 0, _COLLAPSE_, null);
        r = parse_root_(t, b);
        exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
    }

    protected boolean parse_root_(IElementType t, PsiBuilder b) {
        return parse_root_(t, b, 0);
    }

    static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
        return mbti(b, l + 1);
    }

    /* ********************************************************** */
    // KW_ALIAS PARENTHESIS_L (identifier (COMMA identifier)*)? PARENTHESIS_R {
    // 	//	mixin = "com.github.bytecodealliance.language.mixin.MixinDerive"
    // }
    public static boolean alias_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "alias_statement")) return false;
        if (!nextTokenIs(b, KW_ALIAS)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, KW_ALIAS, PARENTHESIS_L);
        r = r && alias_statement_2(b, l + 1);
        r = r && consumeToken(b, PARENTHESIS_R);
        r = r && alias_statement_4(b, l + 1);
        exit_section_(b, m, ALIAS_STATEMENT, r);
        return r;
    }

    // (identifier (COMMA identifier)*)?
    private static boolean alias_statement_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "alias_statement_2")) return false;
        alias_statement_2_0(b, l + 1);
        return true;
    }

    // identifier (COMMA identifier)*
    private static boolean alias_statement_2_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "alias_statement_2_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = identifier(b, l + 1);
        r = r && alias_statement_2_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (COMMA identifier)*
    private static boolean alias_statement_2_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "alias_statement_2_0_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!alias_statement_2_0_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "alias_statement_2_0_1", c)) break;
        }
        return true;
    }

    // COMMA identifier
    private static boolean alias_statement_2_0_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "alias_statement_2_0_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && identifier(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // {
    // 	//	mixin = "com.github.bytecodealliance.language.mixin.MixinDerive"
    // }
    private static boolean alias_statement_4(PsiBuilder b, int l) {
        return true;
    }

    /* ********************************************************** */
    // KW_ENUM identifier enum-body
    public static boolean declare_enum(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_enum")) return false;
        if (!nextTokenIs(b, KW_ENUM)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, DECLARE_ENUM, null);
        r = consumeToken(b, KW_ENUM);
        p = r; // pin = 1
        r = r && report_error_(b, identifier(b, l + 1));
        r = p && enum_body(b, l + 1) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // identifier COLON type-hint {
    // //    mixin = "com.github.bytecodealliance.language.mixin.MixinField"
    // }
    public static boolean declare_field(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_field")) return false;
        if (!nextTokenIs(b, "<declare field>", ESCAPED, SYMBOL)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, DECLARE_FIELD, "<declare field>");
        r = identifier(b, l + 1);
        r = r && consumeTokens(b, 0, COLON, TYPE_HINT);
        r = r && declare_field_3(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // {
    // //    mixin = "com.github.bytecodealliance.language.mixin.MixinField"
    // }
    private static boolean declare_field_3(PsiBuilder b, int l) {
        return true;
    }

    /* ********************************************************** */
    // modifier* KW_FN identifier declare-generic? declare-parameter function-body
    public static boolean declare_function(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_function")) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, DECLARE_FUNCTION, "<declare function>");
        r = declare_function_0(b, l + 1);
        r = r && consumeToken(b, KW_FN);
        r = r && identifier(b, l + 1);
        p = r; // pin = 3
        r = r && report_error_(b, declare_function_3(b, l + 1));
        r = p && report_error_(b, declare_parameter(b, l + 1)) && r;
        r = p && function_body(b, l + 1) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // modifier*
    private static boolean declare_function_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_function_0")) return false;
        while (true) {
            int c = current_position_(b);
            if (!modifier(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "declare_function_0", c)) break;
        }
        return true;
    }

    // declare-generic?
    private static boolean declare_function_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_function_3")) return false;
        declare_generic(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // BRACKET_L (generic-item (COMMA generic-item)*)? BRACKET_R
    public static boolean declare_generic(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_generic")) return false;
        if (!nextTokenIs(b, BRACKET_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, BRACKET_L);
        r = r && declare_generic_1(b, l + 1);
        r = r && consumeToken(b, BRACKET_R);
        exit_section_(b, m, DECLARE_GENERIC, r);
        return r;
    }

    // (generic-item (COMMA generic-item)*)?
    private static boolean declare_generic_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_generic_1")) return false;
        declare_generic_1_0(b, l + 1);
        return true;
    }

    // generic-item (COMMA generic-item)*
    private static boolean declare_generic_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_generic_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = generic_item(b, l + 1);
        r = r && declare_generic_1_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (COMMA generic-item)*
    private static boolean declare_generic_1_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_generic_1_0_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!declare_generic_1_0_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "declare_generic_1_0_1", c)) break;
        }
        return true;
    }

    // COMMA generic-item
    private static boolean declare_generic_1_0_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_generic_1_0_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && generic_item(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // KW_IMPL identifier impl-body
    public static boolean declare_impl(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_impl")) return false;
        if (!nextTokenIs(b, KW_IMPL)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, DECLARE_IMPL, null);
        r = consumeToken(b, KW_IMPL);
        p = r; // pin = 1
        r = r && report_error_(b, identifier(b, l + 1));
        r = p && impl_body(b, l + 1) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // function-signature {
    // //	mixin = "com.github.bytecodealliance.language.mixin.MixinMethod"
    // }
    public static boolean declare_method(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_method")) return false;
        if (!nextTokenIs(b, FUNCTION_SIGNATURE)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, FUNCTION_SIGNATURE);
        r = r && declare_method_1(b, l + 1);
        exit_section_(b, m, DECLARE_METHOD, r);
        return r;
    }

    // {
    // //	mixin = "com.github.bytecodealliance.language.mixin.MixinMethod"
    // }
    private static boolean declare_method_1(PsiBuilder b, int l) {
        return true;
    }

    /* ********************************************************** */
    // KW_PACKAGE package-path
    public static boolean declare_package(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_package")) return false;
        if (!nextTokenIs(b, KW_PACKAGE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, DECLARE_PACKAGE, null);
        r = consumeToken(b, KW_PACKAGE);
        p = r; // pin = 1
        r = r && package_path(b, l + 1);
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // PARENTHESIS_L (type-expression (COMMA type-expression)*)? PARENTHESIS_R
    public static boolean declare_parameter(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_parameter")) return false;
        if (!nextTokenIs(b, PARENTHESIS_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, PARENTHESIS_L);
        r = r && declare_parameter_1(b, l + 1);
        r = r && consumeToken(b, PARENTHESIS_R);
        exit_section_(b, m, DECLARE_PARAMETER, r);
        return r;
    }

    // (type-expression (COMMA type-expression)*)?
    private static boolean declare_parameter_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_parameter_1")) return false;
        declare_parameter_1_0(b, l + 1);
        return true;
    }

    // type-expression (COMMA type-expression)*
    private static boolean declare_parameter_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_parameter_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = type_expression(b, l + 1);
        r = r && declare_parameter_1_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // (COMMA type-expression)*
    private static boolean declare_parameter_1_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_parameter_1_0_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!declare_parameter_1_0_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "declare_parameter_1_0_1", c)) break;
        }
        return true;
    }

    // COMMA type-expression
    private static boolean declare_parameter_1_0_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_parameter_1_0_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && type_expression(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // KW_TRAIT identifier trait-body
    public static boolean declare_trait(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_trait")) return false;
        if (!nextTokenIs(b, KW_TRAIT)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, DECLARE_TRAIT, null);
        r = consumeToken(b, KW_TRAIT);
        p = r; // pin = 1
        r = r && report_error_(b, identifier(b, l + 1));
        r = p && trait_body(b, l + 1) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // KW_TYPE identifier
    public static boolean declare_type(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_type")) return false;
        if (!nextTokenIs(b, KW_TYPE)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, DECLARE_TYPE, null);
        r = consumeToken(b, KW_TYPE);
        p = r; // pin = 1
        r = r && identifier(b, l + 1);
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // identifier (PARENTHESIS_L identifier PARENTHESIS_R)?
    public static boolean declare_variant(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_variant")) return false;
        if (!nextTokenIs(b, "<declare variant>", ESCAPED, SYMBOL)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, DECLARE_VARIANT, "<declare variant>");
        r = identifier(b, l + 1);
        r = r && declare_variant_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (PARENTHESIS_L identifier PARENTHESIS_R)?
    private static boolean declare_variant_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_variant_1")) return false;
        declare_variant_1_0(b, l + 1);
        return true;
    }

    // PARENTHESIS_L identifier PARENTHESIS_R
    private static boolean declare_variant_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "declare_variant_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, PARENTHESIS_L);
        r = r && identifier(b, l + 1);
        r = r && consumeToken(b, PARENTHESIS_R);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // BRACE_L enum-element* BRACE_R
    public static boolean enum_body(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "enum_body")) return false;
        if (!nextTokenIs(b, BRACE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, BRACE_L);
        r = r && enum_body_1(b, l + 1);
        r = r && consumeToken(b, BRACE_R);
        exit_section_(b, m, ENUM_BODY, r);
        return r;
    }

    // enum-element*
    private static boolean enum_body_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "enum_body_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!enum_element(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "enum_body_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // SEMICOLON
    // 	| declare-variant
    static boolean enum_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "enum_element")) return false;
        boolean r;
        r = consumeToken(b, SEMICOLON);
        if (!r) r = declare_variant(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // BRACE_L function-element* BRACE_R
    public static boolean function_body(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "function_body")) return false;
        if (!nextTokenIs(b, BRACE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, BRACE_L);
        r = r && function_body_1(b, l + 1);
        r = r && consumeToken(b, BRACE_R);
        exit_section_(b, m, FUNCTION_BODY, r);
        return r;
    }

    // function-element*
    private static boolean function_body_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "function_body_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!function_element(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "function_body_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // SEMICOLON
    // 	| declare-function
    // 	| declare-test
    // 	| while-statement
    // 	| if-statement
    public static boolean function_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "function_element")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUNCTION_ELEMENT, "<function element>");
        r = consumeToken(b, SEMICOLON);
        if (!r) r = declare_function(b, l + 1);
        if (!r) r = consumeToken(b, DECLARE_TEST);
        if (!r) r = consumeToken(b, WHILE_STATEMENT);
        if (!r) r = consumeToken(b, IF_STATEMENT);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // identifier (COLON type-expression)?
    public static boolean generic_item(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "generic_item")) return false;
        if (!nextTokenIs(b, "<generic item>", ESCAPED, SYMBOL)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, GENERIC_ITEM, "<generic item>");
        r = identifier(b, l + 1);
        r = r && generic_item_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (COLON type-expression)?
    private static boolean generic_item_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "generic_item_1")) return false;
        generic_item_1_0(b, l + 1);
        return true;
    }

    // COLON type-expression
    private static boolean generic_item_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "generic_item_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COLON);
        r = r && type_expression(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // SYMBOL | ESCAPED
    public static boolean identifier(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "identifier")) return false;
        if (!nextTokenIs(b, "<identifier>", ESCAPED, SYMBOL)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
        r = consumeToken(b, SYMBOL);
        if (!r) r = consumeToken(b, ESCAPED);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // BRACE_L impl-element* BRACE_R
    public static boolean impl_body(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "impl_body")) return false;
        if (!nextTokenIs(b, BRACE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, BRACE_L);
        r = r && impl_body_1(b, l + 1);
        r = r && consumeToken(b, BRACE_R);
        exit_section_(b, m, IMPL_BODY, r);
        return r;
    }

    // impl-element*
    private static boolean impl_body_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "impl_body_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!impl_element(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "impl_body_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // declare-function
    //   | declare-method
    //   | constructor
    //   | SEMICOLON
    static boolean impl_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "impl_element")) return false;
        boolean r;
        r = declare_function(b, l + 1);
        if (!r) r = declare_method(b, l + 1);
        if (!r) r = consumeToken(b, CONSTRUCTOR);
        if (!r) r = consumeToken(b, SEMICOLON);
        return r;
    }

    /* ********************************************************** */
    // statements*
    static boolean mbti(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "mbti")) return false;
        while (true) {
            int c = current_position_(b);
            if (!statements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "mbti", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // KW_PUBLIC | KW_PRIVATE
    public static boolean modifier(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "modifier")) return false;
        if (!nextTokenIs(b, "<modifier>", KW_PRIVATE, KW_PUBLIC)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, MODIFIER, "<modifier>");
        r = consumeToken(b, KW_PUBLIC);
        if (!r) r = consumeToken(b, KW_PRIVATE);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // INTEGER
    public static boolean number_literal(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "number_literal")) return false;
        if (!nextTokenIs(b, INTEGER)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, INTEGER);
        exit_section_(b, m, NUMBER_LITERAL, r);
        return r;
    }

    /* ********************************************************** */
    // identifier (OP_DIV identifier)*
    public static boolean package_path(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "package_path")) return false;
        if (!nextTokenIs(b, "<package path>", ESCAPED, SYMBOL)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, PACKAGE_PATH, "<package path>");
        r = identifier(b, l + 1);
        r = r && package_path_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (OP_DIV identifier)*
    private static boolean package_path_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "package_path_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!package_path_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "package_path_1", c)) break;
        }
        return true;
    }

    // OP_DIV identifier
    private static boolean package_path_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "package_path_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, OP_DIV);
        r = r && identifier(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // SEMICOLON
    //     | declare-package
    //     | alias-statement
    // 	| declare-type
    // 	| declare-enum
    // 	| declare-trait
    // 	| declare-impl
    // 	| declare-function
    static boolean statements(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "statements")) return false;
        boolean r;
        r = consumeToken(b, SEMICOLON);
        if (!r) r = declare_package(b, l + 1);
        if (!r) r = alias_statement(b, l + 1);
        if (!r) r = declare_type(b, l + 1);
        if (!r) r = declare_enum(b, l + 1);
        if (!r) r = declare_trait(b, l + 1);
        if (!r) r = declare_impl(b, l + 1);
        if (!r) r = declare_function(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // DOUBLE_QUOTE_L STRING_TEXT DOUBLE_QUOTE_R
    public static boolean string_literal(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string_literal")) return false;
        if (!nextTokenIs(b, DOUBLE_QUOTE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeTokens(b, 0, DOUBLE_QUOTE_L, STRING_TEXT, DOUBLE_QUOTE_R);
        exit_section_(b, m, STRING_LITERAL, r);
        return r;
    }

    /* ********************************************************** */
    // BRACE_L trait-element* BRACE_R
    public static boolean trait_body(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "trait_body")) return false;
        if (!nextTokenIs(b, BRACE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, BRACE_L);
        r = r && trait_body_1(b, l + 1);
        r = r && consumeToken(b, BRACE_R);
        exit_section_(b, m, TRAIT_BODY, r);
        return r;
    }

    // trait-element*
    private static boolean trait_body_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "trait_body_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!trait_element(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "trait_body_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // declare-function
    static boolean trait_element(PsiBuilder b, int l) {
        return declare_function(b, l + 1);
    }

    /* ********************************************************** */
    // type-expression-item (type-infix type-expression-item)*
    public static boolean type_expression(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_expression")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, TYPE_EXPRESSION, "<type expression>");
        r = type_expression_item(b, l + 1);
        r = r && type_expression_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (type-infix type-expression-item)*
    private static boolean type_expression_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_expression_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!type_expression_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "type_expression_1", c)) break;
        }
        return true;
    }

    // type-infix type-expression-item
    private static boolean type_expression_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_expression_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = type_infix(b, l + 1);
        r = r && type_expression_item(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // PARENTHESIS_L type-expression PARENTHESIS_R
    // 	| identifier
    public static boolean type_expression_atom(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_expression_atom")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, TYPE_EXPRESSION_ATOM, "<type expression atom>");
        r = type_expression_atom_0(b, l + 1);
        if (!r) r = identifier(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // PARENTHESIS_L type-expression PARENTHESIS_R
    private static boolean type_expression_atom_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_expression_atom_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, PARENTHESIS_L);
        r = r && type_expression(b, l + 1);
        r = r && consumeToken(b, PARENTHESIS_R);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // type-prefix* type-expression-atom type-suffix*
    public static boolean type_expression_item(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_expression_item")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, TYPE_EXPRESSION_ITEM, "<type expression item>");
        r = type_expression_item_0(b, l + 1);
        r = r && type_expression_atom(b, l + 1);
        r = r && type_expression_item_2(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // type-prefix*
    private static boolean type_expression_item_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_expression_item_0")) return false;
        while (true) {
            int c = current_position_(b);
            if (!type_prefix(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "type_expression_item_0", c)) break;
        }
        return true;
    }

    // type-suffix*
    private static boolean type_expression_item_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_expression_item_2")) return false;
        while (true) {
            int c = current_position_(b);
            if (!type_suffix(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "type_expression_item_2", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // OP_ADD | OP_TO
    public static boolean type_infix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_infix")) return false;
        if (!nextTokenIs(b, "<type infix>", OP_ADD, OP_TO)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, TYPE_INFIX, "<type infix>");
        r = consumeToken(b, OP_ADD);
        if (!r) r = consumeToken(b, OP_TO);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // OP_ADD
    public static boolean type_prefix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_prefix")) return false;
        if (!nextTokenIs(b, OP_ADD)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, OP_ADD);
        exit_section_(b, m, TYPE_PREFIX, r);
        return r;
    }

    /* ********************************************************** */
    // "?"
    public static boolean type_suffix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "type_suffix")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, TYPE_SUFFIX, "<type suffix>");
        r = consumeToken(b, "?");
        exit_section_(b, l, m, r, false, null);
        return r;
    }

}
