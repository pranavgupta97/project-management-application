package com.pranav.projectmanagement.controllers;

import com.pranav.projectmanagement.dao.ProjectRepository;
import com.pranav.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/new")
    public String displayProjectForm(Model model) {

        Project newProject = new Project();

        model.addAttribute("project", newProject);
        return "projects/add-new-project";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createProject(Project project, Model model) {
        projectRepository.save(project);

        return "redirect:/projects/new";
    }
}
