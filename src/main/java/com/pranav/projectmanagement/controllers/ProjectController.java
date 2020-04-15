package com.pranav.projectmanagement.controllers;

import com.pranav.projectmanagement.entities.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/projects")
public class ProjectController {


    @GetMapping("/new")
    public String displayProjectForm(Model model) {

        Project newProject = new Project();

        model.addAttribute("project", newProject);
        return "add-new-project";
    }



}
