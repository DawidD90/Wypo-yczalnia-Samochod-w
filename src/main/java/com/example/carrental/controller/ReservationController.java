package com.example.carrental.controller;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.RentModel;
import com.example.carrental.model.ReservationModel;
import com.example.carrental.service.BranchService;
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
@RequestMapping("/Rentacar")
public class ReservationController {

    private final ReservationService reservationService;
    private final BranchService branchService;
    private final CarsService carsService;

    @GetMapping()
    public String getReservationList(Model model) {
        List<ReservationModel> reservationModels = reservationService.getAllReservations();
        model.addAttribute("reservationModel", reservationModels);
        model.addAttribute("branchModel", branchService.getAllBranch());
        return "Rentacar/Rentacar";
    }
    @PostMapping()
    public RedirectView postAddReservation(ReservationModel reservationModel) {
        reservationService.addReservation(reservationModel);
        return new RedirectView("/Rentacar");
    }
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
