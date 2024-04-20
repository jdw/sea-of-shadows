buildscript {
    dependencies {
        val protobufGradlePluginVersion: String by properties
        classpath("com.google.protobuf:protobuf-gradle-plugin:$protobufGradlePluginVersion")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform") apply false
    id("maven-publish")
    id("org.jetbrains.kotlin.plugin.serialization") apply false
}

version = "0.0.1-SNAPSHOT"
group = "com.github.jdw"

allprojects {
    apply(plugin = "com.google.protobuf")
    apply(plugin = "java")

    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.multiplatform")


}