
plugins {
    kotlin("jvm")
    id("publish")
    `java-library`
    id("io.github.krakowski.jextract") version "0.5.0"
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

tasks.jextract {
    onlyIf { false }

    header("${project.projectDir}/../headers/wgpu.h") {

        // The package under which all source files will be generated
        targetPackage = "io.ygdrasil.wgpu.internal.jvm.panama"

        outputDir = project.objects.directoryProperty()
            .convention(project.layout.projectDirectory.dir("src/main/java"))


    }
}

tasks.withType<Jar>() {

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

}