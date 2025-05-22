package com.trendyol.design.buildlogic

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.artifacts.VersionConstraint
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType

object Configs {
    const val COMPILE_SDK = 35
    const val MIN_SDK = 23
    const val TARGET_SDK = 35
}

fun Project.libs(dependencyName: String): Provider<MinimalExternalModuleDependency> =
    extensions.getByType<VersionCatalogsExtension>().named("libs").findLibrary(dependencyName).get()

fun Project.getVersion(versionName: String): VersionConstraint =
    extensions.getByType<VersionCatalogsExtension>().named("libs").findVersion(versionName).get()

fun Project.pluginId(pluginName: String): String =
    extensions.getByType<VersionCatalogsExtension>().named("libs").findPlugin(pluginName).get().get().pluginId
