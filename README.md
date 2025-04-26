# Container Routing Optimization API

## Overview

This API implements a container-routing optimization algorithm to determine the best movement plan for a set of containers, considering various constraints such as maximum weight, container count, and destination. The API takes in a set of mathematical formulas to apply the optimization algorithm and returns an optimal container-move plan.

## Technologies Used
- **Java** (Spring Boot) for building the backend API.
- **Kafka** and **RabbitMQ** (optional, based on your architecture requirements) for request processing.
- **JUnit** and **Mockito** for unit testing (if applicable).

## Features
- Optimizes container movement based on input constraints.
- Implements basic HTTP API with POST request handling.
- Returns optimal routing plans for container movement.

## Project Structure

```plaintext
container-routing-optimization-api/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── demo/
│                       ├── ContainerRoutingOptimizationApiApplication.java  // Main Spring Boot application
│                       └── optimization/
│                           ├── OptimizationController.java                  // Handles incoming requests
│                           ├── OptimizationService.java                     // Business logic for optimization
│                           └── model/
│                               ├── OptimizationRequest.java                // Request model
│                               ├── OptimizationResponse.java               // Response model
│                               ├── Container.java                          // Container entity
│                               └── Constraints.java                        // Constraints entity
├── pom.xml                                                            // Maven project configuration
└── README.md                                                           // Project details
