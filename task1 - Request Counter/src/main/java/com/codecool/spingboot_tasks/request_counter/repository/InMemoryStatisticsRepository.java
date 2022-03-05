package com.codecool.spingboot_tasks.request_counter.repository;

import com.codecool.spingboot_tasks.request_counter.domain.model.Statistics;
import com.codecool.spingboot_tasks.request_counter.domain.spi.StatisticsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class InMemoryStatisticsRepository implements StatisticsRepository {
    @Override
    public int getCountByMethodName(String method) {
        return 0;
    }

    @Override
    public void saveCountByMethodName(String method, int count) {

    }

    @Override
    public List<Statistics> getStatistics() {
        return null;
    }
}
