package com.caito.bussinesdomain.career;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarrerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrerApplication.class, args);
    }
}
