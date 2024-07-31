
plugins {
    kotlin("jvm")
    id("publish")
    `java-library`
}

kotlin {

}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22))
    }
    withJavadocJar()
    withSourcesJar()
}

