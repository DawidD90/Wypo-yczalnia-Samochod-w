package com.example.carrental.controller;

import com.example.carrental.model.RentModel;
import com.example.carrental.service.RentService;
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
    private final RentService rentService;
    @GetMapping
    public String getRentsList(Model model) {
        List<RentModel> rentModels = rentService.getAllRents();
        model.addAttribute("rentModel", rentModels);
        return "rent/rent";
    }
    @PostMapping
    public RedirectView postAddRent(RentModel rentModel) {
        rentService.addRent(rentModel);
        return new RedirectView("/rent");
    }


    @PostMapping("/edit")
    public RedirectView postEditRent(RentModel rentModel) {
        rentService.saveEditRent(rentModel);
        return new RedirectView("/rent");
    }

    @PostMapping("/delete")
    public RedirectView deleteRent(@PathVariable("id") Long id) {
        rentService.deleteRent(id);
        return new RedirectView("/rent");
    }
}
