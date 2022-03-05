package com.codecool.spingboot_tasks.request_counter.domain.spi;

import com.codecool.spingboot_tasks.request_counter.domain.model.Statistics;

import java.util.List;

public interface StatisticsRepository {
    int getCountByMethodName(String method);
        
    void saveCountByMethodName(String method, int count);

    List<Statistics> getStatistics();
}
