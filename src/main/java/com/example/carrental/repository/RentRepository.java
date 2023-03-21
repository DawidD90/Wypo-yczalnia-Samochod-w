package com.example.carrental.repository;

import com.example.carrental.model.HomeModel;
import com.example.carrental.model.RentModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends JpaRepository<RentModel, Long> {

    Page<RentModel> findAllBy(Pageable pageable);

}

