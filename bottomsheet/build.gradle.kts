plugins {
    id("komposto.library")
    id("komposto.publish")
}

android {
    namespace = "com.trendyol.design.bottomsheet"
}

dependencies {

    api(projects.theme)
    api(projects.core)
    api(libs.kotlinXImmutableCollections)

    implementation(libs.androidxCore)
    implementation(libs.androidxFragmentCompose)
    implementation(libs.androidMaterial)

    implementation(platform(libs.androidxComposeBOM))
    implementation(libs.androidxComposeMaterial)
    implementation(libs.androidxComposeUiTooling)
    implementation(libs.androidxComposeUiUtil)

    implementation(libs.composeCoil)
}