package com.example.carrental.controller;

import com.example.carrental.model.CarStatus;
import com.example.carrental.model.CarsModel;
import com.example.carrental.service.CarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarsService carsService;

    @GetMapping
    public String getCarsList(Model model) {
        List<CarsModel> carsModels = carsService.getAllCars();
        model.addAttribute("carsModel", carsModels);
        model.addAttribute("carStatus", CarStatus.values());
        return "Cars/Cars";
    }
    @PostMapping
    public RedirectView postAddCars(@RequestBody CarsModel carsModel) {
        carsService.addCars(carsModel);
        return new RedirectView("/cars");
    }


    @PostMapping("/edit")
    public RedirectView postEditCars(CarsModel carsModel) {
        carsService.saveEditCars(carsModel);
        return new RedirectView("/cars");
    }

    @PostMapping("/{id}")
    public RedirectView deleteCars(@PathVariable("id") Long id) {
        carsService.deleteCars(id);
        return new RedirectView("/cars");
    }
}
