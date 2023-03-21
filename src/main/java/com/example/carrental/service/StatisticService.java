package com.example.carrental.service;

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


        public List<StatisticsModel> getAllStatics(){
            return statisticsRepository.findAll();
        }
}
