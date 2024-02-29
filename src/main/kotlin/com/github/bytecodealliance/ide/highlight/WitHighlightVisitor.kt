package com.github.bytecodealliance.ide.highlight


import com.github.moonbit.file.MoonFile
import com.github.moonbit.psi.MoonVisitor
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class WitHighlightVisitor : MoonVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null
//
//
//    override fun visitUseAlias(o: _root_ide_package_.com.github.moonbit.psi.WitUseAlias) {
//        highlight(o.identifier, SYM_TYPE)
//        o.aliasName?.let { highlight(it, SYM_TYPE) }
//    }
//
//
//    override fun visitImport(o: _root_ide_package_.com.github.moonbit.psi.WitImport) {
//        super.visitImport(o)
//    }
//
//    override fun visitResource(o: _root_ide_package_.com.github.moonbit.psi.WitResource) {
//        o.identifier?.let { highlight(it, SYM_TYPE) }
//    }
//
//
//    override fun visitRecord(o: _root_ide_package_.com.github.moonbit.psi.WitRecord) {
//        o.identifier?.let { highlight(it, SYM_TYPE) }
//    }
//
//    override fun visitRecordField(o: _root_ide_package_.com.github.moonbit.psi.WitRecordField) {
//        highlight(o.identifier, SYM_FIELD)
//    }
//
//    override fun visitEnum(o: _root_ide_package_.com.github.moonbit.psi.WitEnum) {
//        o.identifier?.let { highlight(it, NUMBER) }
//    }
//
//    override fun visitFlags(o: _root_ide_package_.com.github.moonbit.psi.WitFlags) {
//        o.identifier?.let { highlight(it, NUMBER) }
//    }
//
//    override fun visitSemanticNumber(o: _root_ide_package_.com.github.moonbit.psi.WitSemanticNumber) {
//        highlight(o, SYM_FIELD)
//    }
//
//    override fun visitVariant(o: _root_ide_package_.com.github.moonbit.psi.WitVariant) {
//        o.identifier?.let { highlight(it, SYM_TYPE) }
//    }
//
//    override fun visitVariantItem(o: _root_ide_package_.com.github.moonbit.psi.WitVariantItem) {
//        highlight(o.identifier, SYM_FIELD)
//    }
//
//    override fun visitFunction(o: _root_ide_package_.com.github.moonbit.psi.WitFunction) {
//        highlight(o.identifier, SYM_FUNCTION)
//    }
//
//    override fun visitMethod(o: _root_ide_package_.com.github.moonbit.psi.WitMethod) {
//        highlight(o.identifier, SYM_FUNCTION)
//    }
//
//    override fun visitModifier(o: _root_ide_package_.com.github.moonbit.psi.WitModifier) {
//        highlight(o, KEYWORD)
//    }
//
//    override fun visitParameter(o: _root_ide_package_.com.github.moonbit.psi.WitParameter) {
//        highlight(o.identifier, SYM_FIELD)
//    }
//
//
//    override fun visitDefineType(o: _root_ide_package_.com.github.moonbit.psi.WitDefineType) {
//        o.identifier?.let { highlight(it, SYM_TYPE) }
//    }
//
//    override fun visitTypeGeneric(o: _root_ide_package_.com.github.moonbit.psi.WitTypeGeneric) {
//        when (o.identifier.text) {
//            "_", "bool", "char",
//            "u8", "u16", "u32", "u64",
//            "s8", "s16", "s32", "s64",
//            "f32", "f64", "float32", "float64",
//            "string",
//                -> {
//                highlight(o.identifier, KEYWORD)
//            }
//
//            "list", "tuple",
//            "option", "result",
//            "borrow", "own",
//                -> {
//                highlight(o.identifier, SYM_BUILTIN)
//            }
//
//            else -> {
//                highlight(o.identifier, SYM_TYPE)
//            }
//        }
//    }
//
//    override fun visitInterfaceName(o: _root_ide_package_.com.github.moonbit.psi.WitInterfaceName) {
//        highlight(o, SYM_INTERFACE)
//    }

//    override fun visitSchemaStatement(o: JssSchemaStatement) {
//        //
//        val head = o.firstChild;
//        highlight(head, FluentColor.KEYWORD)
//        //
//        val prop = head.nextLeaf { it.elementType == JssTypes.SYMBOL }!!
//        highlight(prop, FluentColor.SYM_SCHEMA)
//
//        super.visitSchemaStatement(o)
//    }


    private fun highlight(element: PsiElement, color: WitColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)

        infoHolder?.add(builder.create())
    }

    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable,
    ): Boolean {
        infoHolder = holder
        action.run()

        return true
    }

    override fun clone(): HighlightVisitor = WitHighlightVisitor()

    override fun suitableForFile(file: PsiFile): Boolean = file is MoonFile

    override fun visit(element: PsiElement) = element.accept(this)
}

