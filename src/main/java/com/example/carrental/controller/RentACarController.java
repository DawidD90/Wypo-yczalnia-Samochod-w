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
@RequestMapping("/rent")
public class RentACarController {
    private final RentACarService rentACarService;
    @GetMapping
    public String getRentsList(Model model) {
        List<RentACarModel> rentACarModels = rentACarService.getAllRents();
        model.addAttribute("rentACarModel", rentACarModels);
        return "rent/rent";
    }
    @PostMapping
    public RedirectView postAddRent(RentACarModel rentACarModel) {
        rentACarService.addRent(rentACarModel);
        return new RedirectView("/rent");
    }


    @PostMapping("/edit")
    public RedirectView postEditRent(RentACarModel rentACarModel) {
        rentACarService.saveEditRent(rentACarModel);
        return new RedirectView("/rent");
    }

    @PostMapping("/delete")
    public RedirectView deleteRent(@PathVariable("id") Long id) {
        rentACarService.deleteRent(id);
        return new RedirectView("/rent");
    }
}
