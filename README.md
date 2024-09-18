# -Spring-Boot-Load-Balancing-Project
This project demonstrates load balancing in a Spring Boot application using Spring Cloud and Netflix Ribbon. It showcases how to distribute requests among multiple service instances.

## Overview

This project demonstrates load balancing in a Spring Boot application using Spring Cloud and Netflix Ribbon. It showcases how to distribute requests among multiple service instances.

## Features

- Service Discovery: Uses Eureka for locating services.
- Load Balancing: Distributes requests among multiple instances of a service.
- Resilience: Integrates with Hystrix for fault tolerance.

## Prerequisites

- Java 11 or higher
- Maven (for dependency management)
- Spring Cloud Dependencies


### Setup Eureka Server

1. **Run the Eureka Server**: 
   You can set up a simple Eureka server by creating a new Spring Boot project and adding the following dependencies in `pom.xml`:

   ```xml
   <dependency>
       <groupId>org.springframework.cloud</groupId>
       <artifactId>spring-cloud-starter-eureka-server</artifactId>
   </dependency>

