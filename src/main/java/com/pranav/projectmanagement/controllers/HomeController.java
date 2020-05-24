package com.pranav.projectmanagement.controllers;

import com.pranav.projectmanagement.dao.ProjectRepository;
import com.pranav.projectmanagement.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository projectRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayHome(Model model) {

        List<Project> projects = projectRepository.findAll();

        model.addAttribute("projects", projects);

        return "home";
    }
}
