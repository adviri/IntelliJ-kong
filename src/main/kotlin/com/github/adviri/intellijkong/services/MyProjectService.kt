package com.github.adviri.intellijkong.services

import com.github.adviri.intellijkong.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
