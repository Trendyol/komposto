enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://apigwinternal.trendyol.com/tyc-nexus/repository/maven-public/")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://apigwinternal.trendyol.com/tyc-nexus/repository/maven-public/")
        }
    }
}

rootProject.name = "design"
include(":app")
include(":core")
include(":theme")
include(":bottomsheet")
includeBuild("gradle/build-logic")
