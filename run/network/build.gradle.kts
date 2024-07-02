plugins {
    alias(libs.plugins.bharatrun.android.library)
}

android {
    namespace = "com.example.run.network"
}
dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.database)
}