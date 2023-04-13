package com.example.carrental.service;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.CarsModel;
import com.example.carrental.model.StatisticsModel;
import com.example.carrental.repository.CarsRepository;
import com.example.carrental.repository.StatisticsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

//    public void findCarsModelsByBranch(String branch){
//
//        carsRepository.findCarsModelsByBranchModel(branch);
//    }

}

