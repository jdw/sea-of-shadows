package com.github.jdw.seaofshadows.subcommandos.protocol

import com.github.jdw.seaofshadows.Glob
import com.github.jdw.seaofshadows.importing.Canvas2dImporter
import com.github.jdw.seaofshadows.importing.types.renderProtobufv3
import com.github.jdw.seaofshadows.subcommandos.ApiSubcommand
import com.github.jdw.seaofshadows.utils.throws
import kotlinx.coroutines.runBlocking
import java.io.File

class Canvas2d(): ApiSubcommand(
    help = "Import Canvas 2d from Mozilla to local files.",
    defaultPath = File("${Glob.DEFAULT_PROTOBUFV3_PATH}/canvas2d"),
    supportedLanguages = setOf("protobuf-v3"),
    defaultLanguage = "protobuf-v3"
) {
    var deleteWithoutAsking: Boolean = false
    override fun run() {
        val that = this
        Canvas2dImporter { interfaze ->
            runBlocking {
                when (language) {
                    "protobuf-v3" -> interfaze.renderProtobufv3().collect { code ->
                        val file = File("${path.path}/${code.file}")

                        if (file.exists() && deleteWithoutAsking) code.save(file)
                        else if (file.exists() && !deleteWithoutAsking) {
                            println(file.absoluteFile)
                            println(code)
                            println("Click enter when file is verified.")
                            readlnOrNull()
                        }
                        else code.save(file)
                    }

                    else -> throws()
                }
            }
        }
        .apply { run() }

    }
}