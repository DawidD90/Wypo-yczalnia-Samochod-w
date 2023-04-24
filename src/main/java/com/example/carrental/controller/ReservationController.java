package com.example.carrental.controller;

import com.example.carrental.model.*;
import com.example.carrental.service.BranchService;
import com.example.carrental.service.CarsService;
import com.example.carrental.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Controller
@RequestMapping("/Rentacar")
public class ReservationController {

    private final ReservationService reservationService;
    private final BranchService branchService;
    private final CarsService carsService;

// metoda do wyświetlania listy rezerwacji do zrobienia
    @GetMapping()
    public String getReservationList(Model model) {
        List<BranchModel> branchModels = branchService.getAllBranch();
        model.addAttribute("branchModel", branchModels);
//        List<ReservationModel> reservationModels = reservationService.getAllReservations();
//        model.addAttribute("reservationModels", reservationModels);
        return "Rentacar/Rentacar";
    }

//    @PostMapping()
//    public RedirectView findCarsModelsByBranchModel(@PathVariable("id") Long id, @PathVariable("address") String address) {
//        carsService.findCarsModelsByBranchModel(id, address);
//        return new RedirectView("Rentacar/RentAvailableCar");
//    }

    @GetMapping("/RentAvailableCar/{id}/{dateFrom}/{dateTo}")
    public ModelAndView getCarsByBranch(@PathVariable("id") Long id,
                                        @PathVariable("dateFrom") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateFrom,
                                        @PathVariable("dateTo") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateTo) {
        List<CarsModel> carsByBranch = carsService.getAllCars().stream().filter(car ->
                        car.getBranchModel().getId().equals(id))
                .collect(Collectors.toList()).stream().filter(car ->
                        car.getCarStatus().equals(CarStatus.AVAIlABLE)).collect(Collectors.toList());
        ModelAndView modelAndView = new ModelAndView("/Rentacar/RentAvailableCar");
        modelAndView.addObject("carsByBranch", carsByBranch);
        modelAndView.addObject("dateFrom", dateFrom);
        modelAndView.addObject("dateTo", dateTo);
        return modelAndView;
    }

    @PostMapping("/RentAvailableCar/{id}/{dateFrom}/{dateTo}")
    public ModelAndView saveCarAndDate(@PathVariable("id") Long id,
                                       @PathVariable("dateFrom") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateFrom,
                                       @PathVariable("dateTo") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dateTo) {
        ReservationModel reservationModel = new ReservationModel();
        reservationModel.setReservationTo(dateTo);
        reservationModel.setReservationFrom(dateFrom);
        reservationModel.setCarsModel(carsService.getCarsById(id));
        reservationModel.setReservationDate(LocalDate.now());

        ModelAndView modelAndView = new ModelAndView("Rentacar/reservation");
        modelAndView.addObject("carsByBranch", id);
        modelAndView.addObject("dateFrom", dateFrom);
        modelAndView.addObject("dateTo", dateTo);
        modelAndView.addObject("reservationDate", LocalDate.now());
        modelAndView.addObject("reservation", reservationModel);

        reservationService.addReservation(reservationModel);

        return modelAndView;
    }

    @GetMapping("/reservation")
    public String getReservationPanel(Model model) {
        List<ReservationModel> reservationModels = reservationService.getAllReservations();
        model.addAttribute("reservation", reservationModels);
        return "Rentacar/reservation";
    }

//    @GetMapping("/RentAvailableCar")
//    public ModelAndView getReservationPanel(@PathVariable("id") Long id) {
//        List<CarsModel> reservationModels = carsService.getCarsById(id);
//        modelAndView.addObject("carsByBranch", reservationModels);
//        ModelAndView modelAndView = new ModelAndView("/Rentacar/RentAvailableCar");
//        modelAndView.addObject("carsByBranch", carsByBranch);
//        return modelAndView;
//    }

//    @GetMapping("/RentAvailableCar")
//    public String getAvailableCarsList(@PathVariable("id") Long id, @PathVariable("${address}") String address, Model model) {
//        List<CarsModel> carsModelList = carsService.findCarsModelsByBranchModel(id, address);
//        model.addAttribute("availableCars", carsModelList);
//        return "Rentacar/RentAvailableCar";
//    }


//    @GetMapping("/RentAvailableCar/{id}")
//    public RedirectView getCarsByBranch(@PathVariable ("id") Long id, Model model) {
//        List<CarsModel> carsByBranch = carsService.getAllCars().stream().filter(car ->
//                car.getBranchModel().getId().equals(id)).collect(Collectors.toList());
//        model.addAttribute("carsByBranch", carsByBranch);
//        return new RedirectView("/Rentacar/RentacarByBranch");
//    }


//    @PostMapping("/{reservation_id}")
//    public RedirectView postAddReservation(ReservationModel reservationModel) {
//        reservationService.addReservation(reservationModel);
//        return new RedirectView("/Rentacar");
//    }


//    @GetMapping("/RentAvailableCar")
//    public RedirectView getAddReservations(Model model) {
//        List<ReservationModel> reservationModels = reservationService.getAllReservations();
//        model.addAttribute("reservationModels", reservationModels);
//        return new RedirectView("/Rentacar");
//    }

//    @GetMapping("/RentAvailableCar")
//    public String getAvailableCar(Model model) {
//        List<ReservationModel> reservationModels = reservationService.getAllReservations();
//        model.addAttribute("reservationModel", reservationModels);
//        model.addAttribute("branchModel", branchService.getAllBranch());
//        model.addAttribute("carModel", carsService.getAllCars());
//        return "Rentacar/RentAvailableCar";
//    }
//
//    @GetMapping("/RentAvailableCar/{id}")
//    public String getCarsById(@PathVariable("id") Long id, Model model) {
//        CarsModel carsModel = carsService.getCarsById(id);
//        model.addAttribute("carsModel", carsModel.getBranchModel().getAddress());
//        return "Rentacar/RentAvailableCar";
//    }


//    @GetMapping("/RentAvailableCar/{address}")
//    public String findCarsModelsByBranchModel(@PathVariable("address") String address, Long id, Model model) {
//        List<CarsModel> availableCars = carsService.findCarsModelsByBranchModel(address);
//        model.addAttribute("availableCars", availableCars);
//        return "Rentacar/RentAvailableCar";
//    }

//    @PostMapping()
//    public RedirectView findCarsModelsByBranchModel(@PathVariable("${example.address}") Long id) {
//        carsService.findCarsModelsByBranchModel(id, "${example.address}");
//        return new RedirectView("Rentacar/RentAvailableCar");
//    }
//
//    @PostMapping("/Rentacar")
//    public RedirectView postAvailableCar(ReservationModel reservationModel) {
//        reservationService.addReservation(reservationModel);
//        return new RedirectView("/Rentacar/Rentacar");
//    }


//    @GetMapping("/RentAvailableCar/{address}")
//    public RedirectView getCarsByBranch(@PathVariable ("address") String address, Model model) {
//        List<CarsModel> carsByBranch = carsService.getAllCars().stream().filter(car ->
//                car.getBranchModel().getAddress().equals(address)).collect(Collectors.toList());
//        model.addAttribute("carsByBranch", carsByBranch);
//        return new RedirectView("/Rentacar/RentAvailableCar/{address}");
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
