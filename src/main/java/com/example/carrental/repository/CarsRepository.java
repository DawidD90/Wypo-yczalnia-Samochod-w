package com.example.carrental.repository;

import com.example.carrental.model.CarsModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<CarsModel, Long> {

    Page<CarsModel> findAllBy(Pageable pageable);

}
