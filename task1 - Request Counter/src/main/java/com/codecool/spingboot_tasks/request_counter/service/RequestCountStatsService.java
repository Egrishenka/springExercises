package com.codecool.spingboot_tasks.request_counter.service;

import com.codecool.spingboot_tasks.request_counter.controller.RequestCounter;
import com.codecool.spingboot_tasks.request_counter.model.Statistics;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RequestCountStatsService implements RequestCounter {


    /*
     * Map holding statistics of methods execution. key is method name: GET,PUT etc.
     * value is and integer number representing number of executions
     */
    private final Map<String, Integer> stats = new HashMap<>();

    @Override
    public void increaseCounter(String method) throws Exception {
        stats.put(method, stats.getOrDefault(method, 0) + 1);
        System.out.println(stats);
        //throw new RuntimeException("Not implemented");
    }

    public List<Statistics> getStatistics() {
        throw new RuntimeException("Not implemented");
    }
}