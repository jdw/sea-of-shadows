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

kotlin {
    sourceSets {
        val commonMain by getting {
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