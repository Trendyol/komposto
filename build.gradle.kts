// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.composeCompiler).apply(false)
    alias(libs.plugins.jetbrainsKotlinAndroid).apply(false)
    alias(libs.plugins.detekt).apply(false)
    alias(libs.plugins.ksp).apply(false)
    alias(libs.plugins.binaryCompatibilityValidator).apply(true)
    alias(libs.plugins.dokkaDocumentationPlugin).apply(true)
}

apiValidation {
    /**
     * Sub-projects that are excluded from API validation
     */
    ignoredProjects.addAll(listOf("app"))
}

buildscript {
    dependencies {
        classpath(libs.shot)
        classpath(libs.kotlinGradlePlugin)
    }
}

/**
 * This is needed for aggregation as mentioned in documentation:
 * https://kotlinlang.org/docs/dokka-migration.html#update-documentation-aggregation-in-multi-module-projects
 */
dependencies {
    dokka(projects.theme)
    dokka(projects.core)
    dokka(projects.bottomsheet)
}
