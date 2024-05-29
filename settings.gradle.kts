pluginManagement {
    plugins {
        val foojayResolverConventionVersion: String by settings
        val kotlinVersion: String by settings

        id("java")
        id("org.gradle.toolchains.foojay-resolver-convention") version foojayResolverConventionVersion
        id("org.jetbrains.kotlin.multiplatform") version kotlinVersion
        id("org.jetbrains.kotlin.plugin.serialization") version kotlinVersion
        id("maven-publish")
        id("protokt.multiplatform-conventions")
        id("com.toasttab.protokt") version "1.0.0-beta.2"
        id("protokt.multiplatform-conventions")
    }

    repositories {
        mavenCentral()
        mavenLocal()
        gradlePluginPortal()
        google()
    }
}

include(":shared")
include(":core")
include(":webgl-shared")
include(":webgl1-server-side")
include(":webgl1-terminal")
include(":canvas2d-shared")
include(":smolk")

val NAME: String by settings

project(":core").name = "$NAME-core"
project(":webgl1-server-side").name = "$NAME-canvas-webgl1"
project(":smolk").name = "smolk"
project(":webgl1-terminal").name = "$NAME-terminal-webgl1"