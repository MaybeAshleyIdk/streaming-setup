plugins {
	`java-library`
	kotlin("jvm")
	kotlin("plugin.serialization")
}

dependencies {
	implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.0")
}
