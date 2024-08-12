// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.3.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id("com.android.library") version "8.3.2" apply false
    id("io.gitlab.arturbosch.detekt") version("1.23.5")
    id("com.google.devtools.ksp") version("1.9.24-1.0.20") apply false
}

buildscript {
    dependencies {
        classpath(libs.shot)
        classpath(libs.kotlinGradlePlugin)
    }
}
