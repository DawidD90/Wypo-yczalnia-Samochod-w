package com.example.carrental.controller;

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
    private final StatisticsService statisticsService;
    @GetMapping
    public String getStatisticsList(Model model) {
        List<StatisticsModel> statisticsModels = statisticsService.getAllStatistics();
        model.addAttribute("rentACarModel", statisticsModels);
        return "statistics/statistics";
    }
    @PostMapping
    public RedirectView postAddStatistics(StatisticsModel rentACarModel) {
        statisticsService.addStatistics(rentACarModel);
        return new RedirectView("/statistics");
    }


    @PostMapping("/edit")
    public RedirectView postEditStatistics(StatisticsModel statisticsModel) {
        statisticsService.saveEditStatistics(statisticsModel);
        return new RedirectView("/statistics");
    }

    @PostMapping("/delete")
    public RedirectView deleteStatistics(@PathVariable("id") Long id) {
        statisticsService.deleteStatistics(id);
        return new RedirectView("/statistics");
    }

}
