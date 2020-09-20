package com.pranav.projectmanagement.controllers;

import com.pranav.projectmanagement.dao.EmployeeRepository;
import com.pranav.projectmanagement.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String displayEmployeeForm(Model model) {

        Employee newEmployee = new Employee();

        model.addAttribute("employee", newEmployee);

        return "employees/add-employee";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createEmployee(Employee employee, Model model) {

        employeeRepository.save(employee);

        return "redirect:/employees/new";
    }
}
