package com.example.optimization.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptimizedPlanResponse {
    private List<MovePlan> optimizedPlan;
    private int totalDistance;
    private long processingTimeMs;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MovePlan {
        private String containerId;
        private List<String> move;
    }
}
