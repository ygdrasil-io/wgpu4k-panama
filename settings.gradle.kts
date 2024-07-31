rootProject.name = "wgpu4k-panama-root"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
	repositories {
		mavenCentral()}
}

dependencyResolutionManagement {
	repositories {
		mavenCentral()
	}
}

include("wgpu4k-panama")
