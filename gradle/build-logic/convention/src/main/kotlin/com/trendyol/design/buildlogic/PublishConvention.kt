package com.trendyol.design.buildlogic

import com.android.build.gradle.LibraryExtension
import com.vanniktech.maven.publish.SonatypeHost
import org.gradle.api.Plugin
import org.gradle.api.Project
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import org.gradle.kotlin.dsl.configure

class PublishConvention : Plugin<Project> {
    override fun apply(target: Project) = with(target) {
        with(plugins) {
            apply("com.vanniktech.maven.publish")
            apply("org.jetbrains.dokka")
        }

        with(dependencies) {
            add("detektPlugins", libs("detektFormatting"))
            add("detektPlugins", libs("detektFormatting"))
            add("dokkaPlugin", libs("dokkaDocumentationPlugin"))
        }

        extensions.configure<MavenPublishBaseExtension>("mavenPublishing") {
            publishToMavenCentral(SonatypeHost.DEFAULT)

            signAllPublications()

            coordinates(
                groupId = "com.trendyol",
                artifactId = "design-${project.name}",
                version = getVersionFromEnv(),
            )

            pom {
                name.set(project.name.replaceFirstChar { it.uppercase() })
                description.set("Komposto Design System")
                inceptionYear.set("2024")
                url.set("https://github.com/Trendyol/komposto")

                licenses {
                    license {
                        name.set("Apache-2.0 License")
                        url.set("https://opensource.org/license/apache-2-0")
                        distribution.set("https://opensource.org/license/apache-2-0")
                    }
                }
                developers {
                    developer {
                        id.set("komposto")
                        name.set("Komposto Team")
                        url.set("https://github.com/Trendyol")
                    }
                }
                scm {
                    url.set("https://github.com/Trendyol/design-android/")
                    connection.set("scm:git:git//github.com/Trendyol/design-android.git")
                    developerConnection.set("scm:git:ssh://git@github.com/Trendyol/design-android.git")
                }
            }

        }

        configure<LibraryExtension> {
            buildTypes {
                release {
                    isMinifyEnabled = false
                    proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                }
            }
        }
    }

    private fun getVersionFromEnv(): String? {
        return System.getenv("KOMPOSTO_RELEASE_VERSION")?.takeIf { it.isNotBlank() }?.also {
            println("Using release version from environment: $it")
        }
    }
}
