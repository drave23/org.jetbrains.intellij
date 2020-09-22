package com.github.drave23.orgjetbrainsintellij.services

import com.intellij.openapi.project.Project
import com.github.drave23.orgjetbrainsintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
