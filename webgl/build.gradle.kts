buildscript {
    dependencies {
        val protobufGradlePluginVersion: String by properties
        classpath("com.google.protobuf:protobuf-gradle-plugin:$protobufGradlePluginVersion")
    }
}

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("java-library")
    id("org.jetbrains.kotlin.plugin.serialization")
}

val javaVersion: String by properties
val protobufVersion: String by properties

kotlin {
    jvm()
    js() {
        browser()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting {

        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }
}

protobuf {
    protoc {
        // You still need protoc like in the non-Android case
        artifact = "com.google.protobuf:protoc:$protobufVersion"
    }

    generateProtoTasks {

    }
}