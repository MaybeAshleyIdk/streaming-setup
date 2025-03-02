rootProject.name = "obs-scene-collection-transformer"

pluginManagement {
	repositories {
		gradlePluginPortal()
	}
}

dependencyResolutionManagement {
	repositories {
		mavenCentral()
	}

	repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":data-model")
include(":config")
include(":config-parsing")
//include(":json")
include(":main")
