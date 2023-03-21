package com.example.carrental.service;

import com.example.carrental.model.CarsModel;
import com.example.carrental.model.StatisticsModel;
import com.example.carrental.repository.CarsRepository;
import com.example.carrental.repository.StatisticsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class CarsService {

    private final CarsRepository carsRepository;

    public List<CarsModel> getAllCars(){
        return carsRepository.findAll();
    }

    public void addCars(CarsModel carsModel){
        carsRepository.save(carsModel);
    }

    public void saveEditCars(CarsModel editCarsModel) {
        carsRepository.save(editCarsModel);
    }

    public void deleteCars(Long id) {
        carsRepository.deleteById(id);
    }

    public CarsModel getCarsById(Long id) {
        Optional<CarsModel> car = carsRepository.findById(id);
        if(car.isPresent()){
            return carsRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}

