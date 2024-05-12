pluginManagement {
    plugins {
        val foojayResolverConventionVersion: String by settings
        val kotlinVersion: String by settings

        id("java")
        id("org.gradle.toolchains.foojay-resolver-convention") version foojayResolverConventionVersion
        id("org.jetbrains.kotlin.multiplatform") version kotlinVersion
        id("org.jetbrains.kotlin.plugin.serialization") version kotlinVersion
        id("maven-publish")
    }

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        mavenLocal()
    }
}

include(":core")
include(":webgl-shared")
include(":webgl1-canvas")
include(":webgl1-terminal")
include(":cli")


val NAME: String by settings

project(":core").name = "$NAME-core"
project(":webgl1-canvas").name = "$NAME-canvas-webgl1"
project(":cli").name = NAME
project(":webgl1-terminal").name = "$NAME-terminal-webgl1"