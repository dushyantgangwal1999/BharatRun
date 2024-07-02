plugins {
    alias(libs.plugins.bharatrun.android.library)
}

android {
    namespace = "com.example.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson) // For generating mongodb Ids
    implementation(projects.core.domain)
}