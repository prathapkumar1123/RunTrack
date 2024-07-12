plugins {
    alias(libs.plugins.runtrack.android.library)
}

android {
    namespace = "com.kreativmynds.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}