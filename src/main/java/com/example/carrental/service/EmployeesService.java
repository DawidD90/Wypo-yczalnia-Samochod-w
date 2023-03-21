package com.example.carrental.service;

import com.example.carrental.model.CarsModel;
import com.example.carrental.model.EmployeesModel;
import com.example.carrental.repository.CarsRepository;
import com.example.carrental.repository.EmployeesRepositroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class EmployeesService {

    private final EmployeesRepositroy employeesRepositroy;


    public List<EmployeesModel> getAllEmployees(){
        return employeesRepositroy.findAll();
    }
}

