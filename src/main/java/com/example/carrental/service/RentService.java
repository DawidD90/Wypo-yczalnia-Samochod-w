package com.example.carrental.service;

import com.example.carrental.model.EmployeesModel;
import com.example.carrental.model.HomeModel;
import com.example.carrental.model.RentModel;
import com.example.carrental.repository.EmployeesRepositroy;
import com.example.carrental.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class RentService {

    private final RentRepository rentRepository;


    public List<RentModel> getAllRent(){
        return rentRepository.findAll();
    }

    public void saveEditRent(RentModel editRent) { rentRepository.save(editRent);
    }

    public void deleteRent(Long id) {
        rentRepository.deleteById(id);
    }

    public void addRent(RentModel rentModel) {rentRepository.save(rentModel);
    }
}



