package com.example.carrental.service;

import com.example.carrental.model.CarsModel;
import com.example.carrental.model.EmployeesModel;
import com.example.carrental.repository.CarsRepository;
import com.example.carrental.repository.EmployeesRepositroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class EmployeesService {

    private final EmployeesRepositroy employeesRepositroy;

    public List<EmployeesModel> getAllEmployees(){
        return employeesRepositroy.findAll();
    }

    public void addEmployees(EmployeesModel employeesModel){
        employeesRepositroy.save(employeesModel);
    }

    public void saveEditEmployees(EmployeesModel editEmployee) {
        employeesRepositroy.save(editEmployee);
    }

    public void deleteEmployees(Long id) {
        employeesRepositroy.deleteById(id);
    }

    public EmployeesModel getEmployeeById(Long id) {
        Optional<EmployeesModel> employee = employeesRepositroy.findById(id);
        if(employee.isPresent()){
            return employeesRepositroy.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}

