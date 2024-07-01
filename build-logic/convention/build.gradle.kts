@Suppress("DSL_SCOPE_VIOLATION")
plugins {
   `kotlin-dsl`
}

group = "com.example.BharatRun.buildlogic"

dependencies{
   compileOnly(libs.android.gradlePlugin)
   compileOnly(libs.android.tools.common)
   compileOnly(libs.kotlin.gradlePlugin)
   compileOnly(libs.ksp.gradlePlugin)
   compileOnly(libs.room.gradlePlugin)
}