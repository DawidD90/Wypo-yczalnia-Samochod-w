package com.example.carrental.controller;

import com.example.carrental.model.RentModel;
import com.example.carrental.service.CarsService;
import com.example.carrental.service.RentService;
import com.example.carrental.service.ReservationService;
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
@RequestMapping("/Reservation")
public class ReservationController {

    private final ReservationService reservationService;
    private final CarsService carsService;

//    @GetMapping
//    public String getRentsList(Model model) {
//        List<RentModel> rentModels = reservationService.getAllRent();
//        model.addAttribute("rentModel", rentModels);
//        return "Rentacar/Rentacar";
//    }
//    @PostMapping
//    public RedirectView postAddRent(RentModel rentModel) {
//        rentService.addRent(rentModel);
//        return new RedirectView("/rent");
//    }
//
//
//    @PostMapping("/edit")
//    public RedirectView postEditRent(RentModel rentModel) {
//        rentService.saveEditRent(rentModel);
//        return new RedirectView("/rent");
//    }
//
//    @PostMapping("/{id}")
//    public RedirectView deleteRent(@PathVariable("id") Long id) {
//        rentService.deleteRent(id);
//        return new RedirectView("/rent");
//    }
}
