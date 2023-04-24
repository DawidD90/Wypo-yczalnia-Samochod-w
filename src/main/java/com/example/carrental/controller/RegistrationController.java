package com.example.carrental.controller;

import com.example.carrental.Requests.ClientRegistrationRequest;
import com.example.carrental.model.ClientModel;
import com.example.carrental.model.RegistrationModel;
import com.example.carrental.service.ClientService;
import com.example.carrental.service.RegistrationService;
import com.mysql.cj.xdevapi.Client;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/registration")
public class RegistrationController {

    private final RegistrationService registrationService;

    private final ClientService clientService;




    @GetMapping
    public String getRegistrationList(Model model) {
        List<RegistrationModel> registrationModel = registrationService.getAllRegistration();
        model.addAttribute("registrationModel", registrationModel);
        return "auth/registration";
    }
//    @PostMapping
//    public RedirectView postAddRegistration(RegistrationModel registrationModel) {
//        registrationService.addRegistration(registrationModel);
//        return new RedirectView("/login");
//    }

    @PostMapping
    public RedirectView postAddClientRegistration(ClientRegistrationRequest clientRegistrationRequest) {
        ClientModel clientModel=new ClientModel();
        clientModel.setName(clientRegistrationRequest.getName());
        clientModel.setSurname(clientRegistrationRequest.getSurname());
        clientModel.setAddress(clientRegistrationRequest.getAddress());
        clientModel.setEmail(clientRegistrationRequest.getEmail());


        RegistrationModel registrationModel=new RegistrationModel();
        registrationModel.setUsername(clientRegistrationRequest.getUsername());
        registrationModel.setPassword(clientRegistrationRequest.getPassword());
        clientRegistrationRequest.setName(clientModel.getName());
        clientRegistrationRequest.setName(clientModel.getSurname());
        clientRegistrationRequest.setName(clientModel.getAddress());
        clientRegistrationRequest.setName(clientModel.getEmail());
        clientRegistrationRequest.setId(clientModel.getId());
        registrationService.addRegistration(registrationModel);
        clientService.addClient(clientModel);
        return new RedirectView("/login");
    }


    @PostMapping("/editRegistration")
    public RedirectView postEditRegistration(RegistrationModel registrationModel) {
        registrationService.saveEditRegistration(registrationModel);
        return new RedirectView("/registration");
    }

    @PostMapping("/{id}")
    public RedirectView deleteRegistration(@PathVariable("id") Long id) {
        registrationService.deleteRegistration(id);
        return new RedirectView("/registration");
    }

}
