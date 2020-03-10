import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction

class Greetings3 extends DefaultTask {
    @Internal
    String xName="Gradle"

    @TaskAction
    void myAction1(){
        println "Hello $xName!"
    }
    @TaskAction
    def myAction2(){
        println "Hi $xName!"
    }
}