//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.javaVersion
//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinVersion
//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinxCoroutinesVersion
//import com.github.jdw.seaofshadows.SeaOfShadowsProject.Dependencies.kotlinxSerializationVersion

buildscript {
    repositories {
        mavenLocal()
    }
}

plugins {

}

val javaVersion: String by properties
val kotlinVersion: String by properties

kotlin {
    js(IR) {
        binaries.library()
    }
    jvm() {
        withJava()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":seaofshadows-core"))
                implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
            }
        }
        val jsMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-js:$kotlinVersion")
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
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