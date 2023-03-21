package com.example.carrental.controller;

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
public class AboutUsController {

    private final AboutUsService aboutUsService;

    @GetMapping
    public String getAboutList(Model model) {
        List<AboutUsModel> aboutUsModels = aboutUsService.getAllHome();
        model.addAttribute("aboutUsModel", aboutUsModels);
        return "index";
    }
    @PostMapping
    public RedirectView postAddAbout(AboutUsModel aboutUsModel) {
        aboutUsService.addAbout(aboutUsModel);
        return new RedirectView("/");
    }


    @PostMapping("/edit")
    public RedirectView postEditAbout(AboutUsModel aboutUsModel) {
        aboutUsService.saveEditAbout(aboutUsModel);
        return new RedirectView("/");
    }

    @PostMapping("/delete")
    public RedirectView deleteAbout(@PathVariable("id") Long id) {
        aboutUsService.deleteAbout(id);
        return new RedirectView("/");
    }
}
