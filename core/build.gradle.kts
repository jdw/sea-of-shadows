buildscript {
    dependencies {
        val protobufGradlePluginVersion: String by properties
        classpath("com.google.protobuf:protobuf-gradle-plugin:$protobufGradlePluginVersion")
    }
}

plugins {
    id("java-library")
    id("org.jetbrains.kotlin.plugin.serialization")
}

val javaVersion: String by properties
val kotlinxSerializationVersion: String by properties

kotlin {
    jvm()
    js(IR) {
        browser()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting {
            dependencies {
                val protobufVersion: String by properties
                implementation("com.google.protobuf:protobuf-java:$protobufVersion")
                implementation("com.google.protobuf:protobuf-kotlin:$protobufVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$kotlinxSerializationVersion")
            }
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }
}

protobuf {
    generateProtoTasks {
        ofSourceSet("main").forEach {
            kotlin {

            }
        }
    }
}
