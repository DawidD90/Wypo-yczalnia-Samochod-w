package com.example.carrental.controller;

import com.example.carrental.model.CarsModel;
import com.example.carrental.model.ReservationModel;
import com.example.carrental.service.BranchService;
import com.example.carrental.service.CarsService;
import com.example.carrental.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.apache.jasper.tagplugins.jstl.core.Url;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.remoting.RemoteTimeoutException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

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

//    @GetMapping("/Rentacar")
//    public String getAvailableCar(Model model) {
//        List<ReservationModel> reservationModels = reservationService.getAllReservations();
//        model.addAttribute("reservationModel", reservationModels);
//        model.addAttribute("branchModel", branchService.getAllBranch());
//        model.addAttribute("carsModel", carsService.getAllCars());
//        return "Rentacar/RentAvailableCar";
//    }


    @PostMapping("/Rentacar")
    public RedirectView postAvailableCar(ReservationModel reservationModel) {
        reservationService.addReservation(reservationModel);
        return new RedirectView("/Rentacar/Rentacar");
    }


    @GetMapping("/Rentacar/RentAvailableCar/{carsModel}")
    public ResponseEntity <List<CarsModel>> getCarsByBranch(@PathVariable CarsModel carsModel) {
        List<CarsModel> carsByBranch = carsService.getAllCars().stream().filter(car ->
                car.getBranchModel().equals(carsModel.getBranchModel())).collect(Collectors.toList());
        if (carsByBranch.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(carsByBranch, HttpStatus.OK) + new RedirectView("/Rentacar/RentAvailableCar");

    }

//        @GetMapping("/Rentacar/RentAvailableCar/{carsModel}")
//    public String postCarsByBranch(ResponseEntity <List<CarsModel>> getCarsByBranch) {
//           getCarsByBranch.toString();
//        return "Rentacar/RentAvailableCar";
//    }


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
