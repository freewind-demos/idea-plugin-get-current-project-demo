package actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import example.MyComponent

class HelloAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val currentProject = event.project!!
        println("Current project from Action: $currentProject")
    }

}