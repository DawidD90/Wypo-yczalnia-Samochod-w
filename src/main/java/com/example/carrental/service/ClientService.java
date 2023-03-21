package com.example.carrental.service;

import com.example.carrental.model.ClientModel;
import com.example.carrental.model.RentModel;
import com.example.carrental.repository.ClientRepository;
import com.example.carrental.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class ClientService {

    private final ClientRepository ClientRepository;


    public List<ClientModel> getAllClients(){
        return ClientRepository.findAll();
    }

    public void saveEditClient(ClientModel editClient) { ClientRepository.save(editClient);
    }

    public void deleteClient(Long id) {
        ClientRepository.deleteById(id);
    }

    public void addClient(ClientModel ClientModel) {ClientRepository.save(ClientModel);
    }
}

