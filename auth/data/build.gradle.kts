plugins {
    alias(libs.plugins.runtrack.android.library)
}

android {
    namespace = "com.kreativmynds.auth.data"
}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}