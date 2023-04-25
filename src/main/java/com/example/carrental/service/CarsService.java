package com.example.carrental.service;

import com.example.carrental.model.CarsModel;
import com.example.carrental.repository.CarsRepository;
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

    public CarsModel addCars(CarsModel carsModel){
        carsRepository.save(carsModel);
        return carsModel;
    }

    public void saveEditCars(CarsModel editCarsModel) {
        carsRepository.save(editCarsModel);
    }

    public void deleteCars(Long id) {
        carsRepository.deleteById(id);
    }

//    public void findCarsModelsByBranchModelAndCarStatus(String address){
//
//       return carsRepository.findCarsModelsByBranchModelAndCarStatus();
//    }

    public CarsModel getCarsById(Long id){
        Optional<CarsModel> cars = carsRepository.findById(id);
        if(cars.isPresent()){
            return carsRepository.findById(id).orElse(null);
        }else {
            log.info("nie ma pojazdu o id: {}", id);
            return null;
        }
    }

    public void updateCarStatusById(Long id, String carStatus){

        carsRepository.updateCarStatusById(id, carStatus);
    }

    public List<CarsModel> findCarsModelsByBranchModel(Long id, String address){

        carsRepository.findCarsModelsByBranchModel(id, address);
        return null;
    }

}

