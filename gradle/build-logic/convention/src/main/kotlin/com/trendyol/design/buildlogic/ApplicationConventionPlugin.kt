package com.trendyol.design.buildlogic

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import com.google.devtools.ksp.gradle.KspExtension
import com.karumi.shot.ShotExtension
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure

class ApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(pluginId("androidApplication"))
                apply(pluginId("composeCompiler"))
                apply(pluginId("jetbrainsKotlinAndroid"))
                apply(pluginId("detekt"))
                apply(pluginId("shot"))
                apply(pluginId("ksp"))
            }

            with(dependencies) {
                add("detektPlugins", libs("detektFormatting"))
                add("detektPlugins", libs("detektComposeRules"))
            }

            configure<BaseAppModuleExtension> {
                defaultConfig {
                    testApplicationId = "com.trendyol.design.screenshot.test"
                    testInstrumentationRunner = "com.karumi.shot.ShotTestRunner"
                    vectorDrawables {
                        useSupportLibrary = true
                    }
                }

                buildFeatures.compose = true
                composeOptions {
                    kotlinCompilerExtensionVersion = getVersion("kotlin").strictVersion
                }

                packaging {
                    resources {
                        excludes += "/META-INF/{AL2.0,LGPL2.1}"
                    }
                }
            }

            configureAndroid()

            configure<ShotExtension> {
                applicationId = "com.trendyol.design.screenshot.test"
                showOnlyFailingTestsInReports = true
            }

            configure<DetektExtension> {
                buildUponDefaultConfig = true
                config.from.add("$rootDir/config/detekt/detekt.yml")
                config.from.add("$rootDir/config/detekt/detekt-compose.yml")
            }

            configure<KspExtension> {
                arg("skipPrivatePreviews", "true")
            }
        }
    }
}