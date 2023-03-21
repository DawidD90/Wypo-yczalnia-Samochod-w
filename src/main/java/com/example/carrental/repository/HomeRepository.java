package com.example.carrental.repository;

import com.example.carrental.model.EmployeesModel;
import com.example.carrental.model.HomeModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<HomeModel, Long> {

    Page<HomeModel> findAllBy(Pageable pageable);

}
