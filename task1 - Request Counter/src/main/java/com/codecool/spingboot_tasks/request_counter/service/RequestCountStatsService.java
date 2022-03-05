package com.codecool.spingboot_tasks.request_counter.service;

import com.codecool.spingboot_tasks.request_counter.controller.RequestCounter;
import com.codecool.spingboot_tasks.request_counter.model.Statistics;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RequestCountStatsService implements RequestCounter {

    public static String GET = "GET";
    public static String POST = "POST";
    public static String PUT = "PUT";
    public static String DELETE = "DELETE";
    public static String PATCH = "PATCH";
    /*
     * Map holding statistics of methods execution. key is method name: GET,PUT etc.
     * value is and integer number representing number of executions
     */
    private final Map<String, Integer> stats = new HashMap<>();

    @Override
    public void increaseCounter(String method) throws Exception {

        //throw new RuntimeException("Not implemented");
    }

    public List<Statistics> getStatistics() {
        throw new RuntimeException("Not implemented");
    }
}