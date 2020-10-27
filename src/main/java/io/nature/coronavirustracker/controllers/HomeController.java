package io.nature.coronavirustracker.controllers;

import io.nature.coronavirustracker.models.LocationStats;
import io.nature.coronavirustracker.services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronavirusDataService coronavirusDataService;

    @GetMapping("/")
    public String Home(Model model){
        List<LocationStats> allStats = coronavirusDataService.getAllStats();
        model.addAttribute("locationStats", allStats);
        return "home";
    }
}
