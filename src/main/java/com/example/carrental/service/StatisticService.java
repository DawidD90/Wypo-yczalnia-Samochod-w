package com.example.carrental.service;

import com.example.carrental.model.EmployeesModel;
import com.example.carrental.model.RentModel;
import com.example.carrental.model.StatisticsModel;
import com.example.carrental.repository.StatisticsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class StatisticService {

    private final StatisticsRepository statisticsRepository;

    public List<StatisticsModel> getAllStatistics() {
        return statisticsRepository.findAll();
    }

    public void addStatistics(StatisticsModel statisticsModel){
        statisticsRepository.save(statisticsModel);
    }

    public void saveEditStatistics(StatisticsModel editStatistics) {
        statisticsRepository.save(editStatistics);
    }

    public void deleteStatistics(Long id) {
        statisticsRepository.deleteById(id);
    }
}
