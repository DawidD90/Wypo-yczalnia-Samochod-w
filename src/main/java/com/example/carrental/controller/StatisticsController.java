package com.example.carrental.controller;

import com.example.carrental.model.StatisticsModel;
import com.example.carrental.service.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/statistics")
public class StatisticsController {
    private final StatisticService statisticService;
    @GetMapping
    public String getStatisticsList(Model model) {
        List<StatisticsModel> statisticsModels = statisticService.getAllStatistics();
        model.addAttribute("statisticsModel", statisticsModels);
        return "Statistics/Statistics";
    }
    @PostMapping
    public RedirectView postAddStatistics(StatisticsModel statisticsModel) {
        statisticService.addStatistics(statisticsModel);
        return new RedirectView("/statistics");
    }


    @PostMapping("/edit")
    public RedirectView postEditStatistics(StatisticsModel statisticsModel) {
        statisticService.saveEditStatistics(statisticsModel);
        return new RedirectView("/statistics");
    }

    @PostMapping("/delete")
    public RedirectView deleteStatistics(@PathVariable("id") Long id) {
        statisticService.deleteStatistics(id);
        return new RedirectView("/statistics");
    }

}
