// This is a generated file. Not intended for manual editing.
package com.github.moonbit.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.github.moonbit.psi.MoonParserExtension.*;
import static com.github.moonbit.psi.MoonTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MoonParser implements PsiParser, LightPsiParser {

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
    return moon(b, l + 1);
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean alias_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_name")) return false;
    if (!nextTokenIs(b, "<alias name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_NAME, "<alias name>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_CONSTRUCTOR tuple (TO type-hint)?
  public static boolean constructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor")) return false;
    if (!nextTokenIs(b, KW_CONSTRUCTOR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR, null);
    r = consumeToken(b, KW_CONSTRUCTOR);
    p = r; // pin = 1
    r = r && report_error_(b, tuple(b, l + 1));
    r = p && constructor_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (TO type-hint)?
  private static boolean constructor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_2")) return false;
    constructor_2_0(b, l + 1);
    return true;
  }

  // TO type-hint
  private static boolean constructor_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && type_hint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // modifier* KW_FN identifier declare-generic? declare-parameter function-body
  public static boolean declare_function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_function")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DECLARE_FUNCTION, "<declare function>");
    r = declare_function_0(b, l + 1);
    r = r && consumeToken(b, KW_FN);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, declare_function_3(b, l + 1)) && r;
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
  // BRACKET_L identifier BRACKET_R
  public static boolean declare_generic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_generic")) return false;
    if (!nextTokenIs(b, BRACKET_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACKET_L);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, BRACKET_R);
    exit_section_(b, m, DECLARE_GENERIC, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L identifier COLON identifier PARENTHESIS_R
  public static boolean declare_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declare_parameter")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, DECLARE_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TYPE identifier EQ type-hint
  public static boolean define_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "define_type")) return false;
    if (!nextTokenIs(b, KW_TYPE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFINE_TYPE, null);
    r = consumeToken(b, KW_TYPE);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, EQ)) && r;
    r = p && type_hint(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // KW_ENUM identifier BRACE_L (semantic-number (COMMA semantic-number)* COMMA?)? BRACE_R
  public static boolean enum_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_$")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM, null);
    r = consumeToken(b, KW_ENUM);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, enum_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (semantic-number (COMMA semantic-number)* COMMA?)?
  private static boolean enum_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3")) return false;
    enum_3_0(b, l + 1);
    return true;
  }

  // semantic-number (COMMA semantic-number)* COMMA?
  private static boolean enum_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = semantic_number(b, l + 1);
    r = r && enum_3_0_1(b, l + 1);
    r = r && enum_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA semantic-number)*
  private static boolean enum_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enum_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA semantic-number
  private static boolean enum_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && semantic_number(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean enum_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_3_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // KW_EXPORT export-term
  public static boolean export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export")) return false;
    if (!nextTokenIs(b, KW_EXPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPORT, null);
    r = consumeToken(b, KW_EXPORT);
    p = r; // pin = 1
    r = r && export_term(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // function
  // 	| test-statement
  // 	| include-name
  public static boolean export_term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPORT_TERM, "<export term>");
    r = function(b, l + 1);
    if (!r) r = test_statement(b, l + 1);
    if (!r) r = include_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_FLAGS identifier BRACE_L (semantic-number (COMMA semantic-number)* COMMA?)? BRACE_R
  public static boolean flags(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags")) return false;
    if (!nextTokenIs(b, KW_FLAGS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FLAGS, null);
    r = consumeToken(b, KW_FLAGS);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, flags_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (semantic-number (COMMA semantic-number)* COMMA?)?
  private static boolean flags_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3")) return false;
    flags_3_0(b, l + 1);
    return true;
  }

  // semantic-number (COMMA semantic-number)* COMMA?
  private static boolean flags_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = semantic_number(b, l + 1);
    r = r && flags_3_0_1(b, l + 1);
    r = r && flags_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA semantic-number)*
  private static boolean flags_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!flags_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "flags_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA semantic-number
  private static boolean flags_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && semantic_number(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean flags_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "flags_3_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier COLON function-signature {
  // //	mixin = "com.github.bytecodealliance.language.mixin.MixinFunction"
  // }
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    if (!nextTokenIs(b, "<function>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION, "<function>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && function_signature(b, l + 1);
    r = r && function_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  // //	mixin = "com.github.bytecodealliance.language.mixin.MixinFunction"
  // }
  private static boolean function_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // BRACE_L BRACE_R
  public static boolean function_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BRACE_L, BRACE_R);
    exit_section_(b, m, FUNCTION_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // modifier? KW_FUNCTION tuple (TO type-hint)?
  public static boolean function_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_SIGNATURE, "<function signature>");
    r = function_signature_0(b, l + 1);
    r = r && consumeToken(b, KW_FUNCTION);
    p = r; // pin = 2
    r = r && report_error_(b, tuple(b, l + 1));
    r = p && function_signature_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // modifier?
  private static boolean function_signature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_0")) return false;
    modifier(b, l + 1);
    return true;
  }

  // (TO type-hint)?
  private static boolean function_signature_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_3")) return false;
    function_signature_3_0(b, l + 1);
    return true;
  }

  // TO type-hint
  private static boolean function_signature_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_signature_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TO);
    r = r && type_hint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ANGLE_L (type-hint (COMMA type-hint)* COMMA?)? ANGLE_R
  public static boolean generic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic")) return false;
    if (!nextTokenIs(b, ANGLE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ANGLE_L);
    r = r && generic_1(b, l + 1);
    r = r && consumeToken(b, ANGLE_R);
    exit_section_(b, m, GENERIC, r);
    return r;
  }

  // (type-hint (COMMA type-hint)* COMMA?)?
  private static boolean generic_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1")) return false;
    generic_1_0(b, l + 1);
    return true;
  }

  // type-hint (COMMA type-hint)* COMMA?
  private static boolean generic_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_hint(b, l + 1);
    r = r && generic_1_0_1(b, l + 1);
    r = r && generic_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA type-hint)*
  private static boolean generic_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!generic_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA type-hint
  private static boolean generic_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_hint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean generic_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
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
  // KW_IMPORT export-term
  public static boolean import_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_$")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPORT, null);
    r = consumeToken(b, KW_IMPORT);
    p = r; // pin = 1
    r = r && export_term(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // KW_INCLUDE include-name
  public static boolean include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include")) return false;
    if (!nextTokenIs(b, KW_INCLUDE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE, null);
    r = consumeToken(b, KW_INCLUDE);
    p = r; // pin = 1
    r = r && include_name(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // identifier (COLON identifier) (SLASH interface-name) package-version?
  //   | interface-name
  public static boolean include_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name")) return false;
    if (!nextTokenIs(b, "<include name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_NAME, "<include name>");
    r = include_name_0(b, l + 1);
    if (!r) r = interface_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier (COLON identifier) (SLASH interface-name) package-version?
  private static boolean include_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && include_name_0_1(b, l + 1);
    r = r && include_name_0_2(b, l + 1);
    r = r && include_name_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON identifier
  private static boolean include_name_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SLASH interface-name
  private static boolean include_name_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLASH);
    r = r && interface_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // package-version?
  private static boolean include_name_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_name_0_3")) return false;
    package_version(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BRACE_L interface-element* BRACE_R
  public static boolean interface_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body")) return false;
    if (!nextTokenIs(b, BRACE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && interface_body_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, INTERFACE_BODY, r);
    return r;
  }

  // interface-element*
  private static boolean interface_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!interface_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_body_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SEMICOLON
  // 	| while-statement
  // 	| define-type
  // 	| resource
  // 	| record
  // 	| flags
  // 	| enum
  // 	| variant
  // 	| function
  static boolean interface_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_element")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = define_type(b, l + 1);
    if (!r) r = resource(b, l + 1);
    if (!r) r = record(b, l + 1);
    if (!r) r = flags(b, l + 1);
    if (!r) r = enum_$(b, l + 1);
    if (!r) r = variant(b, l + 1);
    if (!r) r = function(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean interface_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_name")) return false;
    if (!nextTokenIs(b, "<interface name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_NAME, "<interface name>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // modifier? KW_LET identifier (COLON identifier)? EQ identifier
  public static boolean let_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LET_STATEMENT, "<let statement>");
    r = let_statement_0(b, l + 1);
    r = r && consumeToken(b, KW_LET);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, let_statement_3(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, EQ)) && r;
    r = p && identifier(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // modifier?
  private static boolean let_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_statement_0")) return false;
    modifier(b, l + 1);
    return true;
  }

  // (COLON identifier)?
  private static boolean let_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_statement_3")) return false;
    let_statement_3_0(b, l + 1);
    return true;
  }

  // COLON identifier
  private static boolean let_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON function-signature {
  // //	mixin = "com.github.bytecodealliance.language.mixin.MixinMethod"
  // }
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, "<method>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD, "<method>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && function_signature(b, l + 1);
    r = r && method_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  // //	mixin = "com.github.bytecodealliance.language.mixin.MixinMethod"
  // }
  private static boolean method_3(PsiBuilder b, int l) {
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
  // SYMBOL | ESCAPED
  public static boolean module_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_name")) return false;
    if (!nextTokenIs(b, "<module name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_NAME, "<module name>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statements*
  static boolean moon(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moon")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "moon", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_PACKAGE package-name
  public static boolean package_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_$")) return false;
    if (!nextTokenIs(b, KW_PACKAGE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE, null);
    r = consumeToken(b, KW_PACKAGE);
    p = r; // pin = 1
    r = r && package_name(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // module-name (COLON module-name)* package-version?
  public static boolean package_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name")) return false;
    if (!nextTokenIs(b, "<package name>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_NAME, "<package name>");
    r = module_name(b, l + 1);
    r = r && package_name_1(b, l + 1);
    r = r && package_name_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COLON module-name)*
  private static boolean package_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!package_name_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "package_name_1", c)) break;
    }
    return true;
  }

  // COLON module-name
  private static boolean package_name_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && module_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // package-version?
  private static boolean package_name_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_name_2")) return false;
    package_version(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AT VERSION
  public static boolean package_version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_version")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, VERSION);
    exit_section_(b, m, PACKAGE_VERSION, r);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON type-hint {
  // }
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    if (!nextTokenIs(b, "<parameter>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type_hint(b, l + 1);
    r = r && parameter_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  // }
  private static boolean parameter_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // KW_RECORD identifier BRACE_L record-element* BRACE_R
  public static boolean record(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record")) return false;
    if (!nextTokenIs(b, KW_RECORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RECORD, null);
    r = consumeToken(b, KW_RECORD);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, record_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // record-element*
  private static boolean record_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "record_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // record-field
  //   | COMMA
  static boolean record_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_element")) return false;
    boolean r;
    r = record_field(b, l + 1);
    if (!r) r = consumeToken(b, COMMA);
    return r;
  }

  /* ********************************************************** */
  // identifier COLON type-hint {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinField"
  // }
  public static boolean record_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_field")) return false;
    if (!nextTokenIs(b, "<record field>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECORD_FIELD, "<record field>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type_hint(b, l + 1);
    r = r && record_field_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinField"
  // }
  private static boolean record_field_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // KW_RESOURCE identifier (BRACE_L resource-element* BRACE_R)?
  public static boolean resource(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource")) return false;
    if (!nextTokenIs(b, KW_RESOURCE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE, null);
    r = consumeToken(b, KW_RESOURCE);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && resource_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (BRACE_L resource-element* BRACE_R)?
  private static boolean resource_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_2")) return false;
    resource_2_0(b, l + 1);
    return true;
  }

  // BRACE_L resource-element* BRACE_R
  private static boolean resource_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BRACE_L);
    r = r && resource_2_0_1(b, l + 1);
    r = r && consumeToken(b, BRACE_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // resource-element*
  private static boolean resource_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!resource_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "resource_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // method
  //   | constructor
  //   | SEMICOLON
  static boolean resource_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_element")) return false;
    boolean r;
    r = method(b, l + 1);
    if (!r) r = constructor(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // SYMBOL | ESCAPED
  public static boolean semantic_number(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semantic_number")) return false;
    if (!nextTokenIs(b, "<semantic number>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEMANTIC_NUMBER, "<semantic number>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, ESCAPED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // package
  //   | let-statement
  //   | declare-function
  //   | test-statement
  //   | while-statement
  //   | SEMICOLON
  static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    r = package_$(b, l + 1);
    if (!r) r = let_statement(b, l + 1);
    if (!r) r = declare_function(b, l + 1);
    if (!r) r = test_statement(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    if (!nextTokenIs(b, "<string literal>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_TEST string-literal function-body
  public static boolean test_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "test_statement")) return false;
    if (!nextTokenIs(b, KW_TEST)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEST_STATEMENT, null);
    r = consumeToken(b, KW_TEST);
    p = r; // pin = 1
    r = r && report_error_(b, string_literal(b, l + 1));
    r = p && function_body(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PARENTHESIS_L (parameter (COMMA parameter)* COMMA?)? PARENTHESIS_R
  public static boolean tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && tuple_1(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, TUPLE, r);
    return r;
  }

  // (parameter (COMMA parameter)* COMMA?)?
  private static boolean tuple_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1")) return false;
    tuple_1_0(b, l + 1);
    return true;
  }

  // parameter (COMMA parameter)* COMMA?
  private static boolean tuple_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && tuple_1_0_1(b, l + 1);
    r = r && tuple_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter)*
  private static boolean tuple_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!tuple_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA parameter
  private static boolean tuple_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean tuple_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier generic?
  public static boolean type_generic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_generic")) return false;
    if (!nextTokenIs(b, "<type generic>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_GENERIC, "<type generic>");
    r = identifier(b, l + 1);
    r = r && type_generic_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generic?
  private static boolean type_generic_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_generic_1")) return false;
    generic(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // tuple | type-generic
  public static boolean type_hint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_hint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_HINT, "<type hint>");
    r = tuple(b, l + 1);
    if (!r) r = type_generic(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier (KW_AS alias-name)? {
  // }
  public static boolean use_alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_alias")) return false;
    if (!nextTokenIs(b, "<use alias>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE_ALIAS, "<use alias>");
    r = identifier(b, l + 1);
    r = r && use_alias_1(b, l + 1);
    r = r && use_alias_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (KW_AS alias-name)?
  private static boolean use_alias_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_alias_1")) return false;
    use_alias_1_0(b, l + 1);
    return true;
  }

  // KW_AS alias-name
  private static boolean use_alias_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_alias_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_AS);
    r = r && alias_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // }
  private static boolean use_alias_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // KW_VARIANT identifier BRACE_L (variant-item (COMMA variant-item)* COMMA?)? BRACE_R
  public static boolean variant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant")) return false;
    if (!nextTokenIs(b, KW_VARIANT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIANT, null);
    r = consumeToken(b, KW_VARIANT);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, variant_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (variant-item (COMMA variant-item)* COMMA?)?
  private static boolean variant_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3")) return false;
    variant_3_0(b, l + 1);
    return true;
  }

  // variant-item (COMMA variant-item)* COMMA?
  private static boolean variant_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variant_item(b, l + 1);
    r = r && variant_3_0_1(b, l + 1);
    r = r && variant_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA variant-item)*
  private static boolean variant_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variant_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variant_3_0_1", c)) break;
    }
    return true;
  }

  // COMMA variant-item
  private static boolean variant_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variant_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean variant_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_3_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // identifier (PARENTHESIS_L type-hint PARENTHESIS_R)? {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinVariantItem"
  // }
  public static boolean variant_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_item")) return false;
    if (!nextTokenIs(b, "<variant item>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIANT_ITEM, "<variant item>");
    r = identifier(b, l + 1);
    r = r && variant_item_1(b, l + 1);
    r = r && variant_item_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (PARENTHESIS_L type-hint PARENTHESIS_R)?
  private static boolean variant_item_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_item_1")) return false;
    variant_item_1_0(b, l + 1);
    return true;
  }

  // PARENTHESIS_L type-hint PARENTHESIS_R
  private static boolean variant_item_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_item_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && type_hint(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //    mixin = "com.github.bytecodealliance.language.mixin.MixinVariantItem"
  // }
  private static boolean variant_item_2(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean while_elements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_elements")) return false;
    if (!nextTokenIs(b, "<while elements>", ESCAPED, SYMBOL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_ELEMENTS, "<while elements>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_WHILE identifier BRACE_L while-elements* BRACE_R
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_STATEMENT, null);
    r = consumeToken(b, KW_WHILE);
    p = r; // pin = 1
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, while_statement_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // while-elements*
  private static boolean while_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!while_elements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "while_statement_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SEMICOLON
  // 	| include
  // 	| import
  // 	| export
  // 	| while-statement
  // 	| define-type
  // 	| enum
  // 	| variant
  // 	| record
  // 	| resource
  // 	| COMMENT_LINE
  static boolean world_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "world_element")) return false;
    boolean r;
    r = consumeToken(b, SEMICOLON);
    if (!r) r = include(b, l + 1);
    if (!r) r = import_$(b, l + 1);
    if (!r) r = export(b, l + 1);
    if (!r) r = while_statement(b, l + 1);
    if (!r) r = define_type(b, l + 1);
    if (!r) r = enum_$(b, l + 1);
    if (!r) r = variant(b, l + 1);
    if (!r) r = record(b, l + 1);
    if (!r) r = resource(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT_LINE);
    return r;
  }

}
