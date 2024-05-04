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

val name: String by settings

project(":core").name = "$name-core"
project(":canvas-2d").name = "$name-canvas-2d"
project(":canvas-webgl").name = "$name-canvas-webgl"
project(":cli").name = name
project(":terminal").name = "$name-terminal"