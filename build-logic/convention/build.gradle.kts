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

gradlePlugin{
   plugins {
      register("androidApplication"){
         id = "bharatrun.android.application"
         implementationClass = "AndroidApplicationConventionPlugin"
      }
      register("androidApplicationCompose"){
         id = "bharatrun.android.application.compose"
         implementationClass = "AndroidApplicationComposeConventionPlugin"
      }
      register("androidLibrary"){
         id = "bharatrun.android.library"
         implementationClass = "AndroidLibraryConventionPlugin"
      }
      register("androidLibraryCompose"){
         id = "bharatrun.android.library.compose"
         implementationClass = "AndroidLibraryComposeConventionPlugin"
      }
   }
}