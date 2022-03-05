package com.codecool.spingboot_tasks.request_counter.controller;

import com.codecool.spingboot_tasks.request_counter.model.Statistics;
import com.codecool.spingboot_tasks.request_counter.service.api.RequestCounterStatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
class RequestStatsController {
    private final RequestCounterStatsService requestCounter;

    public RequestStatsController(RequestCounterStatsService requestCounter){
        this.requestCounter = requestCounter;
    }

    @GetMapping("/api/statistics")
    public List<Statistics> getAllStatistics() throws Exception {
        Statistics newElement1 = new Statistics("GET", 3);
        Statistics newElement2 = new Statistics("POST", 2);
        Statistics newElement3 = new Statistics("PUT", 1);

        return List.of(newElement1, newElement2, newElement3);
    }


}
