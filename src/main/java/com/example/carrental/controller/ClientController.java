package com.example.carrental.controller;

import com.example.carrental.model.CarsModel;
import com.example.carrental.model.ClientModel;
import com.example.carrental.service.CarsService;
import com.example.carrental.service.ClientService;
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
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public String getClientList(Model model) {
        List<ClientModel> clientModel = clientService.getAllClients();
        model.addAttribute("clientModel", clientModel);
        return "Clients/Clients";
    }
    @PostMapping
    public RedirectView postAddClient(ClientModel carsModel) {
        clientService.addClient(carsModel);
        return new RedirectView("/client");
    }


    @PostMapping("/edit")
    public RedirectView postEditClients(ClientModel carsModel) {
        clientService.saveEditClient(carsModel);
        return new RedirectView("/client");
    }

    @PostMapping("/{id}")
    public RedirectView deleteCLient(@PathVariable("id") Long id) {
        clientService.deleteClient(id);
        return new RedirectView("/client");
    }
}
