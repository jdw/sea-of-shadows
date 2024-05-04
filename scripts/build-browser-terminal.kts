#!/usr/bin/env kotlin
//https://kotlinlang.org/docs/command-line.html#run-scripts

import java.io.File
import java.io.IOException
import kotlin.script.dependencies.Environment
import kotlin.system.exitProcess

fun String.runCommand(workingDir: File): String? {
    try {
        val parts = this.split("\\s".toRegex())
        val proc = ProcessBuilder(*parts.toTypedArray())
            .directory(workingDir)
            .redirectOutput(ProcessBuilder.Redirect.PIPE)
            .redirectError(ProcessBuilder.Redirect.PIPE)
            .start()

        proc.waitFor()

        if (!proc.exitValue().equals(0))
            throw Exception(proc.errorStream.bufferedReader().readText())

        return proc.inputStream.bufferedReader().readText()
    } catch(e: IOException) {
        e.printStackTrace()
        return null
    }
}

fun String.runCommand(): String? {
    try {
        val parts = this.split("\\s".toRegex())
        val proc = ProcessBuilder(*parts.toTypedArray())
            .redirectOutput(ProcessBuilder.Redirect.PIPE)
            .redirectError(ProcessBuilder.Redirect.PIPE)
            .start()

        proc.waitFor()

        if (!proc.exitValue().equals(0))
            throw Exception(proc.errorStream.bufferedReader().readText())

        return proc.inputStream.bufferedReader().readText()
    } catch(e: IOException) {
        e.printStackTrace()
        return null
    }
}

fun printHelpAndExit() {
    //var version = """grep "^version" build.gradle.kts""".runCommand()

    println("./scripts/build-browser-terminal.kts <development|production> <target dir>")
    exitProcess(0)
}

fun main(args: Array<String>) {
    if(args.any({ entry -> entry.equals("--help") })
            .or(args.size != 2)) printHelpAndExit()

    val compilationTargets = setOf("production", "development")

    val compilationTarget = args[0]
    if (!compilationTargets.contains(compilationTarget)) {
        println("Compilation target '$compilationTarget' is not known...")
        println()
        println("Valid compilation targets are:")
        compilationTargets.forEach {
            println(" * $it")
        }
        println()

        exitProcess(1)
    }

    val path = File(args[1])
    if (!path.exists()) {
        println("Path '${path.path}' does not exist...")
        exitProcess(2)
    }

    // You need a main function in terminal for this to work
    val gradleCommand = if (compilationTarget.equals("production")) {
        "./gradlew :terminal:jsBrowserProductionWebpack"
    }
    else {
        "./gradlew :terminal:jsBrowserDevelopmentWebpack"
    }

    gradleCommand.runCommand()
    val copy = "cp -f terminal/output/seaofshadows-terminal-0.0.1-SNAPSHOT.js examples/0.0.1-SNAPSHOT-http4k-canvas2d-proof-of-concept/src/main/resources/sea-of-shadows--terminal.js"
    //TODO doesn't work Runtime.getRuntime().exec(copy)
}

main(args)