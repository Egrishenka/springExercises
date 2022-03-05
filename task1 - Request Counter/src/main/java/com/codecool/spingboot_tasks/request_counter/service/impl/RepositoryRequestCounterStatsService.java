package com.codecool.spingboot_tasks.request_counter.service.impl;

import com.codecool.spingboot_tasks.request_counter.repository.RepositoryInterface;
import com.codecool.spingboot_tasks.request_counter.service.api.RequestCounterStatsService;
import com.codecool.spingboot_tasks.request_counter.service.api.Statistics;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class RepositoryRequestCounterStatsService implements RequestCounterStatsService {
    private final RepositoryInterface repository;

    public RepositoryRequestCounterStatsService(RepositoryInterface repository) {
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
