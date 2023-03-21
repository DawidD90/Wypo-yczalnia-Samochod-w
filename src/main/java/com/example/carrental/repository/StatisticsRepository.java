package com.example.carrental.repository;

import com.example.carrental.model.StatisticsModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface StatisticsRepository extends JpaRepository<StatisticsModel, Long> {

        Page<StatisticsModel> findAllBy(Pageable pageable);

    }

