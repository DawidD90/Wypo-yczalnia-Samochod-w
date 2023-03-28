package com.example.carrental.repository;

import com.example.carrental.model.EmployeesModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesModel, Long> {

    Page<EmployeesModel> findAllBy(Pageable pageable);

}

