package com.codecool.spingboot_tasks.request_counter.controller;

public interface RequestCounter {

    String GET = "GET";
    String POST = "POST";
    String PUT = "PUT";
    String DELETE = "DELETE";
    String PATCH = "PATCH";

    void increaseCounter(String method) throws Exception;


}
