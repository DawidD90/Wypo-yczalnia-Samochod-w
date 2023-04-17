package com.example.carrental.repository;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.CarsModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CarsRepository extends JpaRepository<CarsModel, Long> {

    Page<CarsModel> findAllBy(Pageable pageable);


//    List<CarsModel> findCarsModelsByBranchModelAndCarStatus();

    @Modifying
    @Transactional
    @Query("UPDATE CarsModel t SET t.carStatus = :status WHERE t.id = :id")
    int updateCarStatusById(@Param("id") Long id, @Param("status") String carStatus);

    @Modifying
    @Transactional
    @Query("from CarsModel t where t.id = :id and t.branchModel.address = :address")
    int findCarsModelsByBranchModel(@Param("id") Long id, @Param("address") String address);


//    @Modifying
//    @Transactional
//    @Query("SELECT CarsModel.branchModel.address from CarsModel WHERE CarsModel.branchModel.address = :a")
//    List<CarsModel> findCarsModelsByBranchModel(@Param("a") String a);


}
