package com.codecool.spingboot_tasks.request_counter.repository;

import com.codecool.spingboot_tasks.request_counter.service.api.Statistics;

import java.util.List;

class Repository implements RepositoryInterface{
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
