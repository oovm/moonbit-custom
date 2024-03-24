package com.github.bytecodealliance.ide.actions

import com.github.moonbit.MessageBundle
import com.github.moonbit.file.MoonIconProvider
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class FluentCreateFile : CreateFileFromTemplateAction(name, description, MoonIconProvider.Moon) {
    companion object {
        private val name = MessageBundle.message("action.create_file")
        private val description = MessageBundle.message("action.create_file.description")

        // See [resources/colors/fileTemplate]
        private const val templatePath = "Fluent File";
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: Builder) {
        builder.setTitle(name).addKind("Empty file", MoonIconProvider.Moon, templatePath)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = name
}
