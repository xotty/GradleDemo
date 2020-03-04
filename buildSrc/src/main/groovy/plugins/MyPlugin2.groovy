package plugins
import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin2 implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('MyTask2',group:'demo_plugin').doLast {
            println 'MyTask2  in plugin from buildSrc class'
        }
    }
}
