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
include(":canvas-2d")
include(":canvas-webgl")
include(":cli")
include(":terminal")

val NAME: String by settings

project(":core").name = "$NAME-core"
project(":canvas-2d").name = "$NAME-canvas-2d"
project(":canvas-webgl").name = "$NAME-canvas-webgl"
project(":cli").name = NAME
project(":terminal").name = "$NAME-terminal"