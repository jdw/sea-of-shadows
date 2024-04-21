plugins {
    id("org.jetbrains.kotlin.multiplatform") apply false
    id("maven-publish")
    id("org.jetbrains.kotlin.plugin.serialization")
}

version = "0.0.1-SNAPSHOT"
group = "com.github.jdw"

allprojects {
    apply(plugin = "java")
    apply(plugin = "idea")

    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.multiplatform")
    apply(plugin = "org.jetbrains.kotlin.plugin.serialization")
}