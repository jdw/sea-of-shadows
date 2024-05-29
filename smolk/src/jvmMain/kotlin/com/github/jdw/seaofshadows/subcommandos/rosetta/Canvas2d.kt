package com.github.jdw.seaofshadows.subcommandos.rosetta

import com.github.jdw.seaofshadows.importing.Canvas2dImporter
import com.github.jdw.seaofshadows.importing.types.renderKotlin
import com.github.jdw.seaofshadows.subcommandos.ApiSubcommand
import com.github.jdw.seaofshadows.utils.throws
import kotlinx.coroutines.runBlocking
import java.io.File

class Canvas2d: ApiSubcommand(help = "Import Canvas 2D data.", defaultPath = File("canvas2d-shared/src/commonMain/kotlin/com/github/jdw/seaofshadows/canvas2d/shared")) {
    override fun run() {
        handleDeletion()
        runBlocking {
            val importer = Canvas2dImporter()
            importer.renderBlock = { interfaze ->
                var filename = ""
                val code = when (language) {
                    "kotlin" -> {
                        filename = "${interfaze.simpleName}.kt"
                        interfaze.renderKotlin()
                    }

                    else -> throws()
                }
                code.save(File("${path.path}/$filename"))
            }
            importer.run()
        }
    }
}