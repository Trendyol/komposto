package com.trendyol.design.buildlogic

import com.android.build.gradle.LibraryExtension
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension

class LibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
                apply("io.gitlab.arturbosch.detekt")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            with(dependencies) {
                add("detektPlugins", libs("detektFormatting"))
                add("detektPlugins", libs("detektComposeRules"))
            }

            configure<LibraryExtension> {
                buildFeatures.compose = true

                composeOptions {
                    kotlinCompilerExtensionVersion = getVersion("kotlin").strictVersion
                }
            }

            configure<KotlinAndroidProjectExtension> {
                explicitApi()
            }

            configureAndroid()

            configure<DetektExtension> {
                buildUponDefaultConfig = true
                config.from.add("$rootDir/config/detekt/detekt.yml")
                config.from.add("$rootDir/config/detekt/detekt-compose.yml")
            }
        }
    }
}