plugins {
	application
	kotlin("jvm")
	id("com.gradleup.shadow")
}

dependencies {
	implementation(projects.configParsing)
	implementation(projects.dataModel)
}

application {
	mainClass = "io.github.maybeashleyidk.streamingsetup.obsscenetransformer.Main"
}
