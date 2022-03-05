package com.codecool.spingboot_tasks.request_counter.repository;

import com.codecool.spingboot_tasks.request_counter.service.api.Statistics;

import java.util.List;

public interface RepositoryInterface {
    int getCountByMethodName(String method);
        
    void saveCountByMethodName(String method, int count);

    List<Statistics> getStatistics();
}
