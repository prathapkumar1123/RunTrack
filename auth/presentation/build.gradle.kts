plugins {
    alias(libs.plugins.runtrack.android.feature.ui)
}

android {
    namespace = "com.kreativmynds.auth.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}