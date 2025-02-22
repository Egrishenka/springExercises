package com.codecool.spingboot_tasks.request_counter.controller;


import com.codecool.spingboot_tasks.request_counter.domain.api.RequestCounterStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
class RequestCounterController {

    private final List<String> shoppingCart;

    private final RequestCounterStatsService requestCounter;

    @Autowired
    public RequestCounterController(RequestCounterStatsService requestCounter) throws InterruptedException {
        this.shoppingCart = new ArrayList<>();
        this.requestCounter = requestCounter;
    }

    @GetMapping("/api/requests")
    public ResponseEntity<Void> get() throws Exception{
        System.out.println("GET method being called...");
        requestCounter.increaseCounter(RequestCounterStatsService.HTTPMethod.GET);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/requests")
    public ResponseEntity<Void> post() {
        System.out.println("POST method being called...");
        return ResponseEntity.ok().build();
    }

    @PutMapping("/api/requests")
    public ResponseEntity<Void> put() {
        System.out.println("PUT method being called...");
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/api/requests")
    public ResponseEntity<Void> delete() throws Exception{
        requestCounter.increaseCounter(RequestCounterStatsService.HTTPMethod.DELETE);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/api/requests")
    public ResponseEntity<Void> patch() {
        return ResponseEntity.ok().build();
    }

}