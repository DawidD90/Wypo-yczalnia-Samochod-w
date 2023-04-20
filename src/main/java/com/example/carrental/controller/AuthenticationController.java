package com.example.carrental.controller;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.CarStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class AuthenticationController {

    @GetMapping("/login")
    public String getLogin(){
        return "auth/login";
    }



//    @GetMapping("/registration")
//    public String getAddRegistration(Model model) {
//        List<BranchModel> list = branchService.getAllBranch();
//        model.addAttribute("branchModel", list);
//        model.addAttribute("carStatus", CarStatus.values());
//        return "Cars/addCar";

    }