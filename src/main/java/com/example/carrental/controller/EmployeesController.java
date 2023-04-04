package com.example.carrental.controller;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.EmployeesModel;
import com.example.carrental.service.BranchService;
import com.example.carrental.service.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/employees")
public class EmployeesController {
    private final EmployeesService employeesService;

    private final BranchService branchService;


@GetMapping()
    public String getEmployeesList(Model model) {
        List<EmployeesModel> employeesModels = employeesService.getAllEmployees();
        model.addAttribute("EmployeesModel", employeesModels);
        return "Employees/Employees";
    }
    @PostMapping
    public RedirectView postAddEmployees(EmployeesModel employeesModel) {
        employeesService.addEmployees(employeesModel);
        return new RedirectView("/employees");
    }

    @GetMapping("/addEmployee")
    public String getAddEmployee(Model model) {
        List<BranchModel> list = branchService.getAllBranch();
        model.addAttribute("branchModel", list);
        return "Employees/addEmployee";
    }
    @PostMapping("/addEmployee")
    public RedirectView postAddEmployee(EmployeesModel employee) {
        employeesService.addEmployees(employee);
        return new RedirectView("/employees");
    }


    @PostMapping("/edit")
    public RedirectView postEditEmployees(EmployeesModel employeesModel) {
        employeesService.saveEditEmployees(employeesModel);
        return new RedirectView("/employees");
    }

    @PostMapping("/{id}")
    public RedirectView deleteEmployees(@PathVariable("id") Long id) {
        employeesService.deleteEmployees(id);
        return new RedirectView("/employees");
    }
}
