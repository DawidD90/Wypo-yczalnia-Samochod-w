package com.example.carrental.service;

import com.example.carrental.model.CarsModel;
import com.example.carrental.model.StatisticsModel;
import com.example.carrental.repository.CarsRepository;
import com.example.carrental.repository.StatisticsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class CarsService {


    private final CarsRepository carsRepository;


    public List<CarsModel> getAllCars(){
        return carsRepository.findAll();
    }
}

