
import com.github.jdw.seaofshadows.SeaOfShadowsProject
import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.javaVersion
import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinxCoroutinesVersion
import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinxSerializationVersion
import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.ktorVersion

buildscript {
    repositories {
        mavenLocal()
    }
}

plugins {
    id("java-library")
    id("maven-publish")
}

kotlin {
    js(IR) {
        browser()

        binaries.library()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":seaofshadows-core"))
                implementation(project(":seaofshadows-canvas-webgl"))

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")

                implementation("io.ktor:ktor-client-core:$ktorVersion")
                implementation("io.ktor:ktor-client-websockets:$ktorVersion")
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(project(":seaofshadows-core"))
                implementation(project(":seaofshadows-canvas-webgl"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
                implementation("io.ktor:ktor-client-core-js:$ktorVersion")
                implementation("io.ktor:ktor-client-websockets-js:$ktorVersion")
            }
        }
    }
}

getTasksByName("jsProductionExecutableCompileSync", false).forEach { task ->
    task.dependsOn("jsBrowserProductionLibraryDistribution")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }

    sourceCompatibility = JavaVersion.toVersion(javaVersion)
    targetCompatibility = JavaVersion.toVersion(javaVersion)
}

tasks.forEach { task ->
    if (task.name == "clean") {
        task.doFirst {
            delete(setOf("${task.project.projectDir}/output"))
        }
    }
}