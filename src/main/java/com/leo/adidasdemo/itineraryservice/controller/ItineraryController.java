package com.leo.adidasdemo.itineraryservice.controller;

import com.leo.adidasdemo.itineraryservice.dao.RouteRepository;
import com.leo.adidasdemo.itineraryservice.entities.Route;
import com.leo.adidasdemo.itineraryservice.service.PathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItineraryController {
    @Autowired
    private PathService pathService;
    @GetMapping("/getShortestPath")
    public List<String> getShortestPath(@RequestParam(value = "start",required = false) String start, @RequestParam(value = "end",required = false) String end) {
        List<String> res=pathService.getShorestRoute(start,end);
        return res;
    }
}
