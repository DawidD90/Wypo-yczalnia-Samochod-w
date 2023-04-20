package com.example.carrental.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@RequiredArgsConstructor
@Controller
public class AuthenticationController {

    @GetMapping("/login")
    public String getLogin(){
        return "auth/login";
    }

    @GetMapping("/registration")
    public String getRegistration(){return "auth/registration";}
    }

