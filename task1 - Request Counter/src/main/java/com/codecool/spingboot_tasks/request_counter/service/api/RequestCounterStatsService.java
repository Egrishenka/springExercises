package com.codecool.spingboot_tasks.request_counter.service.api;

import java.util.List;

public interface RequestCounterStatsService {

    void increaseCounter(HTTPMethod method) throws Exception;
    List<Statistics> getStatistics() throws Exception;

    enum HTTPMethod {
        GET,
        POST,
        PUT,
        DELETE,
        PATCH
    }
}
