package com.example.demo.limit_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by sofia on 2019-01-02.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
@SpringBootApplication
@EnableHystrix
public class Section04MicroserviceLimitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section04MicroserviceLimitServiceApplication.class, args);
	}

}
