package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka 服务的提供者
 */
@EnableEurekaClient
@SpringBootApplication
public class DemoEurekaProvide {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaProvide.class, args);
    }

}
