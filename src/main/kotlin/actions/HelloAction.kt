package actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import example.MyComponent

class HelloAction : AnAction() {

    override fun actionPerformed(event: AnActionEvent) {
        val component = event.project?.getComponent(MyComponent::class.java) as MyComponent
        component.helloInComponent()
    }

}