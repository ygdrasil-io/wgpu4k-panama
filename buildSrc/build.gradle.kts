plugins {
	`kotlin-dsl`
}


repositories {
	gradlePluginPortal()
	mavenCentral()
}

dependencies {
	implementation(libs.download)
	implementation(libs.jreleaser.plugin)
}
