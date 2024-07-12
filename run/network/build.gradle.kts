plugins {
    alias(libs.plugins.runtrack.android.library)
}

android {
    namespace = "com.kreativmynds.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}