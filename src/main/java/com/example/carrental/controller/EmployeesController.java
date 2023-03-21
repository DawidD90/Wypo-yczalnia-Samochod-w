package com.example.carrental.controller;

import com.example.carrental.model.EmployeesModel;
import com.example.carrental.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/employees")
public class EmployeesController {
    private final EmployeesService employeesService;

    @GetMapping
    public String getEmployeesList(Model model) {
        List<EmployeesModel> employeesModels = employeesService.getAllEmployees();
        model.addAttribute("employeesModel", employeesModels);
        return "employees/employees";
    }
    @PostMapping
    public RedirectView postAddEmployees(EmployeesModel employeesModel) {
        employeesService.addEmployees(employeesModel);
        return new RedirectView("/employees");
    }


    @PostMapping("/edit")
    public RedirectView postEditEmployees(EmployeesModel employeesModel) {
        employeesService.saveEditEmployees(employeesModel);
        return new RedirectView("/employees");
    }

    @PostMapping("/delete")
    public RedirectView deleteEmployyes(@PathVariable("id") Long id) {
        employeesService.deleteEmployees(id);
        return new RedirectView("/employees");
    }
}
