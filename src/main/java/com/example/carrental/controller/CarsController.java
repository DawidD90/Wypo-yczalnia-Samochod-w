package com.example.carrental.controller;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.CarStatus;
import com.example.carrental.model.CarsModel;
import com.example.carrental.model.EmployeesModel;
import com.example.carrental.service.BranchService;
import com.example.carrental.service.CarsService;
import lombok.NoArgsConstructor;
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

    private final BranchService branchService;

    @GetMapping
    public String getCarsList(Model model) {
        List<CarsModel> carsModels = carsService.getAllCars();
        model.addAttribute("carsModel", carsModels);
        model.addAttribute("carStatus", CarStatus.values());
        return "Cars/Cars";
    }

    @PostMapping
    public RedirectView postAddCars(CarsModel carsModel) {
        carsService.addCars(carsModel);
        return new RedirectView("/cars");
    }

    @GetMapping("/addCar")
    public String getAddCar(Model model) {
        List<BranchModel> list = branchService.getAllBranch();
        model.addAttribute("branchModel", list);
        model.addAttribute("carStatus", CarStatus.values());
        return "Cars/addCar";
    }

    @PostMapping("/addCar")
    public RedirectView postAddCar(CarsModel car) {
        carsService.addCars(car);
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
