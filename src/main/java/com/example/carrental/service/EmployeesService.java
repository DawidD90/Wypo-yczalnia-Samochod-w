package com.example.carrental.service;

import com.example.carrental.model.EmployeesModel;
import com.example.carrental.repository.EmployeesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class EmployeesService {

    private final EmployeesRepository employeesRepository;

    public List<EmployeesModel> getAllEmployees(){
        return employeesRepository.findAll();
    }

    public void addEmployees(EmployeesModel employeesModel){
        employeesRepository.save(employeesModel);
    }

    public void saveEditEmployees(EmployeesModel editEmployee) {
        employeesRepository.save(editEmployee);
    }

    public void deleteEmployees(Long id) {
        employeesRepository.deleteById(id);
    }

    public EmployeesModel getEmployeeById(Long id) {
        Optional<EmployeesModel> employee = employeesRepository.findById(id);
        if(employee.isPresent()){
            return employeesRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}

