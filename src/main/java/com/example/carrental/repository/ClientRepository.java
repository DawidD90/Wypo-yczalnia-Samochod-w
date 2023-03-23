package com.example.carrental.repository;

import com.example.carrental.model.CarsModel;
import com.example.carrental.model.ClientModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {

    Page<ClientModel> findAllBy(Pageable pageable);

}

