pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val foojayResolverConventionVersion: String by settings
        val protobufGradlePluginVersion: String by settings

        id("java")
        id("com.google.protobuf") version protobufGradlePluginVersion
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

rootProject.name = "sea-of-shadows"

include("core")
include("webgl")