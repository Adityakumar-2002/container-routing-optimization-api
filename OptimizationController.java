package com.example.optimization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.optimization.model.ContainerRequest;
import com.example.optimization.model.OptimizedPlanResponse;
import com.example.optimization.service.OptimizationService;

@RestController
@RequestMapping("/optimize-routes")
public class OptimizationController {

    @Autowired
    private OptimizationService optimizationService;

    @PostMapping
    public OptimizedPlanResponse optimize(@RequestBody ContainerRequest containerRequest) {
        long startTime = System.nanoTime();
        OptimizedPlanResponse response = optimizationService.optimize(containerRequest);
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000;
        response.setProcessingTimeMs(durationMs);
        return response;
    }
}
