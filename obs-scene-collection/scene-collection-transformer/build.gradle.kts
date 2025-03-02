import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper

plugins {
	val kotlinVersion = "2.1.10"
	kotlin("jvm") version kotlinVersion apply false
	kotlin("plugin.serialization") version kotlinVersion apply false

	id("com.gradleup.shadow") version "9.0.0-beta9" apply false
}

allprojects {
	val jvmCompatibilityVersion = JavaVersion.VERSION_21

	plugins.withType<JavaLibraryPlugin> {
		with(extensions.getByName<JavaPluginExtension>("java")) {
			targetCompatibility = jvmCompatibilityVersion
			sourceCompatibility = targetCompatibility
		}
	}

	plugins.withType<ApplicationPlugin> {
		with(extensions.getByName<JavaPluginExtension>("java")) {
			targetCompatibility = jvmCompatibilityVersion
			sourceCompatibility = targetCompatibility
		}
	}

	plugins.withType<KotlinPluginWrapper> {
		with(extensions.getByName<KotlinJvmExtension>("kotlin")) {
			compilerOptions {
				jvmTarget = provider {
					val javaPluginExtension: JavaPluginExtension = extensions.getByName<JavaPluginExtension>("java")
					JvmTarget.fromTarget(javaPluginExtension.targetCompatibility.toString())
				}
			}

			explicitApi()
		}
	}
}
