package com.example.carrental.repository;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.CarsModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CarsRepository extends JpaRepository<CarsModel, Long> {

    Page<CarsModel> findAllBy(Pageable pageable);


//    List<CarsModel> carsByBranch(BranchModel branchModel);


//    @Transactional
//    @Query("SELECT CarsModel from ReservationModel WHERE CarsModel.branchModel = :branch")
//    List<CarsModel> findCarsModelsByBranchModel(@Param("branch") String branch);

}
