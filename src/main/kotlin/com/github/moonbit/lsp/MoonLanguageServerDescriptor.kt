package com.github.moonbit.lsp

import com.github.moonbit.file.MoonFileType
import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor

class MoonLanguageServerDescriptor : ProjectWideLspServerDescriptor {
    override val lspServerListener = MoonLanguageServerListener()

    constructor(project: Project) : super(project, "moon-lsp")

    override fun isSupportedFile(file: VirtualFile): Boolean {
        return file.fileType is MoonFileType
    }

    override fun createCommandLine(): GeneralCommandLine {
        return GeneralCommandLine("moon-lsp")
    }
}
