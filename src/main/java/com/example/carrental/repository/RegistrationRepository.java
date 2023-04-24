package com.example.carrental.repository;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.RegistrationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationModel, Long> {
    Page<RegistrationModel> findAllBy(Pageable pageable);
}
