package com.example.optimization.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContainerRequest {
    private List<Container> containers;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Container {
        private String id;
        private String source;
        private String destination;
    }
}
