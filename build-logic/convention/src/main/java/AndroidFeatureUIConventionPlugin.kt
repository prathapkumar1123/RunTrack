import com.android.build.api.dsl.LibraryExtension
import com.kreativmynds.convention.ExtensionType
import com.kreativmynds.convention.addUILayerDependencies
import com.kreativmynds.convention.configureAndroidCompose
import com.kreativmynds.convention.configureBuildTypes
import com.kreativmynds.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

class AndroidFeatureUIConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("runtrack.android.library.compose")
            }

            dependencies {
                addUILayerDependencies(target)
            }
        }
    }

}