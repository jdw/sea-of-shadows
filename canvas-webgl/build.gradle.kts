import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.javaVersion
import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinVersion
import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinxCoroutinesVersion
import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinxSerializationVersion

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
    jvm() {
        withJava()
    }
    js() {
        browser()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":seaofshadows-core"))

                //implementation("org.jetbrains.kotlin:kotlin-dom-api-compat:$kotlinVersion")
                implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$kotlinxSerializationVersion")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinxCoroutinesVersion")
            }
        }
        val jvmMain by getting {
            dependencies {

            }
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }

    sourceCompatibility = JavaVersion.toVersion(javaVersion)
    targetCompatibility = JavaVersion.toVersion(javaVersion)
}