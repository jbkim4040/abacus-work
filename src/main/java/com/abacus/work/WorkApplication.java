package com.abacus.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkApplication.class, args);
    }

}
