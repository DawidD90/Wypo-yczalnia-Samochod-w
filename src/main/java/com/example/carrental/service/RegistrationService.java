package com.example.carrental.service;

import com.example.carrental.model.RegistrationModel;
import com.example.carrental.repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class RegistrationService {
    private final RegistrationRepository registrationRepository;

    public List<RegistrationModel> getAllRegistration(){
        return registrationRepository.findAll();
    }

    public void addRegistration(RegistrationModel registrationModel){
        registrationRepository.save(registrationModel);
    }

    public void saveEditRegistration(RegistrationModel registrationModel) {
        registrationRepository.save(registrationModel);
    }

    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }

    public RegistrationModel getRegistrationById(Long id) {
        Optional<RegistrationModel> registration = registrationRepository.findById(id);
        if(registration.isPresent()){
            return registrationRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}


