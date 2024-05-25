kotlin {
    jvm() {
        withJava()
    }

    applyDefaultHierarchyTemplate()

    sourceSets {
        val commonMain by getting
    }
}

val javaVersion: String by properties

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }

    sourceCompatibility = JavaVersion.toVersion(javaVersion)
    targetCompatibility = JavaVersion.toVersion(javaVersion)
}