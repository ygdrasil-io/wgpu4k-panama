import java.nio.file.Files

plugins {
    kotlin("jvm")
    id("publish")
    `java-library`
    id("io.github.krakowski.jextract") version "0.5.0"
}

val resourcesDirectory = project.file("build").resolve("generated").resolve("resources")
val buildNativeResourcesDirectory = project.file("build").resolve("native")

kotlin {

}

sourceSets {
    main {
        resources {
            //srcDirs(resourcesDirectory.absolutePath)
        }
    }

}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22))
    }
    withJavadocJar()
    withSourcesJar()
}

tasks.jextract {
    // Set to true to regenerate binding, jextract must be on your path
    onlyIf { false }

    header(buildNativeResourcesDirectory.resolve("wgpu.h").absolutePath) {

        // The package under which all source files will be generated
        targetPackage = "io.ygdrasil.wgpu.internal.jvm.panama"

        outputDir = project.objects.directoryProperty()
            .convention(project.layout.projectDirectory.dir("src/main/java"))


    }
}

tasks.withType<Jar> {

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

}

configureDownloadTasks {
    baseUrl = "${project.properties["wgpu.base.url"]}${libs.versions.wgpu.get()}/"

    download("wgpu-macos-aarch64-release.zip") {
        extract("include/webgpu/webgpu.h", buildNativeResourcesDirectory.resolve("webgpu.h")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("include").resolve("webgpu").resolve("webgpu.h").toPath(),
                buildNativeResourcesDirectory.resolve("webgpu.h").toPath()
            )
            buildNativeResourcesDirectory.resolve("include").deleteRecursively()
        }
        extract("include/wgpu/wgpu.h", buildNativeResourcesDirectory.resolve("wgpu.h")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("include").resolve("wgpu").resolve("wgpu.h").toPath(),
                buildNativeResourcesDirectory.resolve("wgpu.h").toPath()
            )
            buildNativeResourcesDirectory.resolve("include").deleteRecursively()
        }
        extract("lib/libwgpu_native.dylib", resourcesDirectory.resolve("darwin-aarch64").resolve("libWGPU.dylib"))
    }

    download("wgpu-macos-x86_64-release.zip") {
        extract("lib/libwgpu_native.dylib", resourcesDirectory.resolve("darwin-x86-64").resolve("libWGPU.dylib"))
    }

    download("wgpu-windows-x86_64-msvc-release.zip") {
        extract("lib/wgpu_native.dll", resourcesDirectory.resolve("win32-x86-64").resolve("WGPU.dll"))
    }

    download("wgpu-linux-x86_64-release.zip") {
        extract("lib/libwgpu_native.so", resourcesDirectory.resolve("linux-x86-64").resolve("libWGPU.so"))
    }

    download("wgpu-linux-aarch64-release.zip") {
        extract("lib/libwgpu_native.so", resourcesDirectory.resolve("linux-aarch64").resolve("libWGPU.so"))
    }
}