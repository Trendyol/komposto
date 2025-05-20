plugins {
    id("komposto.library")
    id("komposto.publish")
}

android {
    namespace = "com.trendyol.theme"
}

publishing.publications.getByName<MavenPublication>("release") {
    artifactId = "design-theme"
}

dependencies {

    implementation(libs.androidxCore)

    implementation(platform(libs.androidxComposeBOM))
    implementation(libs.androidxComposeMaterial)
    implementation(libs.androidxComposeUiTooling)
}
