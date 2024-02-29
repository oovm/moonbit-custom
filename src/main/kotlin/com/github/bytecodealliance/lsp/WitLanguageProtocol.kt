package com.github.bytecodealliance.lsp

import com.github.moonbit.file.MoonFileType
import com.github.moonbit.file.MoonIconProvider
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.platform.lsp.api.LspServer
import com.intellij.platform.lsp.api.LspServerSupportProvider
import com.intellij.platform.lsp.api.LspServerSupportProvider.LspServerStarter
import com.intellij.platform.lsp.api.lsWidget.LspServerWidgetItem


class WitLanguageProtocol : LspServerSupportProvider {
    override fun fileOpened(project: Project, file: VirtualFile, serverStarter: LspServerStarter) {
        if (file.fileType is MoonFileType) {
            serverStarter.ensureServerStarted(WitLanguageServerDescriptor(project))
        }
    }

    override fun createLspServerWidgetItem(lspServer: LspServer, currentFile: VirtualFile?): LspServerWidgetItem? {
        return LspServerWidgetItem(
            lspServer,
            currentFile,
            MoonIconProvider.Moon,
            null
        )
    }
}

