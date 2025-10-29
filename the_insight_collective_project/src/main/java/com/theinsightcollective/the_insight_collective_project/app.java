/* Entry point for the Spring Boot application.
It launches the application using SpringApplication.run(). */

package com.theinsightcollective.the_insight_collective_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class app {
    public static void main(String[] args) {
        SpringApplication.run(app.class, args);
    }
}