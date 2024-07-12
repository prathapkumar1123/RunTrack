plugins {
    alias(libs.plugins.runtrack.android.library)
    alias(libs.plugins.runtrack.jvm.ktor)
}

android {
    namespace = "com.kreativmynds.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}