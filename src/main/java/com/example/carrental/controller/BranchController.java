package com.example.carrental.controller;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.EmployeesModel;
import com.example.carrental.repository.BranchRepository;
import com.example.carrental.service.BranchService;
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
@RequestMapping("/branch")
public class BranchController {

    private final BranchService branchService;



@GetMapping
    public String getBranchList(Model model) {
        List<BranchModel> branchModels = branchService.getAllBranch();
        model.addAttribute("branchModel", branchModels);
        return "Branches/Branches";
    }




    @PostMapping
    public RedirectView postAddBranch(BranchModel branchModel) {
        branchService.addBranch(branchModel);
        return new RedirectView("/branch");
    }


    @PostMapping("/edit")
    public RedirectView postEditBranch(BranchModel branchModel) {
        branchService.saveEditBrach(branchModel);
        return new RedirectView("/branch");
    }

    @PostMapping("/{id}")
    public RedirectView deleteBranch(@PathVariable("id") Long id) {
        branchService.deleteBranch(id);
        return new RedirectView("/branch");
    }
}
