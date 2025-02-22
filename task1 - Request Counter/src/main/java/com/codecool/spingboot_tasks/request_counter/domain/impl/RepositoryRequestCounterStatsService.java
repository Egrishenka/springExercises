package com.codecool.spingboot_tasks.request_counter.domain.impl;

import com.codecool.spingboot_tasks.request_counter.domain.spi.StatisticsRepository;
import com.codecool.spingboot_tasks.request_counter.domain.api.RequestCounterStatsService;
import com.codecool.spingboot_tasks.request_counter.domain.model.Statistics;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class RepositoryRequestCounterStatsService implements RequestCounterStatsService {
    private final StatisticsRepository repository;

    public RepositoryRequestCounterStatsService(StatisticsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void increaseCounter(HTTPMethod method) throws Exception {
        int count = repository.getCountByMethodName(method.name());
        repository.saveCountByMethodName(method.name(), count + 1);
    }

    @Override
    public List<Statistics> getStatistics() throws Exception {
        return repository.getStatistics();

    }
}
