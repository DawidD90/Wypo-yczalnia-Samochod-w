package com.example.carrental.service;

import com.example.carrental.model.EmployeesModel;
import com.example.carrental.model.HomeModel;
import com.example.carrental.model.RentModel;
import com.example.carrental.repository.EmployeesRepositroy;
import com.example.carrental.repository.HomeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class HomeService {

    private final HomeRepository homeRepository;


    public List<HomeModel> getAllHome(){
        return homeRepository.findAll();
    }

    public void saveEditHome(HomeModel editHome) { homeRepository.save(editHome);
    }

    public void deleteHome(Long id) {
        homeRepository.deleteById(id);
    }

    public void addHome(HomeModel homeModel) {homeRepository.save(homeModel);
    }
}

