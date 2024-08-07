import com.android.build.api.dsl.LibraryExtension
import com.example.convention.addUiLayerDependencies
import com.example.convention.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidFeatureUIConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("bharatrun.android.library.compose")
            }

            dependencies {
                addUiLayerDependencies(target)
            }
        }
    }
}