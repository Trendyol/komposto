plugins {
    id("komposto.library")
    id("komposto.publish")
    id("kotlin-parcelize")
}

android {
    namespace = "com.trendyol.design.core"
}

publishing.publications.getByName<MavenPublication>("release") {
    artifactId = "design-core"
}

dependencies {

    api(projects.theme)

    implementation(libs.androidxCore)

    implementation(platform(libs.androidxComposeBOM))
    implementation(libs.androidxComposeMaterial)
    implementation(libs.androidxComposeUiTooling)
    implementation(libs.androidxComposeUiUtil)
    implementation(libs.kotlinXImmutableCollections)
}
