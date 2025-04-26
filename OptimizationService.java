package com.example.optimization.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.optimization.model.ContainerRequest;
import com.example.optimization.model.OptimizedPlanResponse;

@Service
public class OptimizationService {

    private final Random random = new Random();

    public OptimizedPlanResponse optimize(ContainerRequest request) {
        List<OptimizedPlanResponse.MovePlan> movePlans = new ArrayList<>();
        int totalDistance = 0;

        for (ContainerRequest.Container container : request.getContainers()) {
            List<String> moves = new ArrayList<>();
            moves.add(container.getSource());
            moves.add(container.getDestination());

            // Simulate distance calculation
            int distance = random.nextInt(500) + 500; // random distance between 500 and 1000
            totalDistance += distance;

            movePlans.add(new OptimizedPlanResponse.MovePlan(container.getId(), moves));
        }

        return new OptimizedPlanResponse(movePlans, totalDistance, 0);
    }
}
