package com.codecool.spingboot_tasks.request_counter.service;

public interface RequestCounterStatsService {

    void increaseCounter(HTTPMethod method) throws Exception;


    enum HTTPMethod {

        GET,
        POST,
        PUT,
        DELETE,
        PATCH

    }
}
