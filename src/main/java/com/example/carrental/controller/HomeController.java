package com.example.carrental.controller;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.HomeModel;
import com.example.carrental.service.BranchService;
import com.example.carrental.service.HomeService;
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
@RequestMapping("/")
public class HomeController {

    private final HomeService homeService;

    private final BranchService branchService;


    @GetMapping
    public String getHomeList(Model model) {
        List<HomeModel> homeModels = homeService.getAllHome();
        model.addAttribute("homeModel", homeModels);
        List<BranchModel> branchModels = branchService.getAllBranch();
        model.addAttribute("branchModel", branchModels);
        return "index";
    }


    @PostMapping
    public RedirectView postAddHome(HomeModel homeModel) {
        homeService.addHome(homeModel);
        return new RedirectView("/");
    }


    @PostMapping("/edit")
    public RedirectView postEditHome(HomeModel homeModel) {
        homeService.saveEditHome(homeModel);
        return new RedirectView("/");
    }

    @PostMapping("/{id}")
    public RedirectView deleteHome(@PathVariable("id") Long id) {
        homeService.deleteHome(id);
        return new RedirectView("/");
    }
}
