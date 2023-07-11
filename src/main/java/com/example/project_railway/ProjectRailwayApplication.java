package com.example.project_railway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.project_railway.Repository")
@EntityScan("com.example.project_railway.Model")
@SpringBootApplication
public class ProjectRailwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectRailwayApplication.class, args);
    }

}
