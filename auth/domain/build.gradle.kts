plugins {
    alias(libs.plugins.runtrack.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}