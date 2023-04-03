package com.example.carrental.service;

import com.example.carrental.model.BranchModel;
import com.example.carrental.model.EmployeesModel;
import com.example.carrental.repository.BranchRepository;
import com.example.carrental.repository.EmployeesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class BranchService {

    private final BranchRepository branchRepository;

    public List<BranchModel> getAllBranch(){
        return branchRepository.findAll();
    }

    public void addBranch(BranchModel branchModel){
        branchRepository.save(branchModel);
    }

    public void saveEditBrach(BranchModel branchModel) {
        branchRepository.save(branchModel);
    }

    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }

    public BranchModel getBranchById(Long id) {
        Optional<BranchModel> branch = branchRepository.findById(id);
        if(branch.isPresent()){
            return branchRepository.findById(id).orElse(null);
        } else {
            log.info("brak");
            return null;
        }
    }
}

