package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sofia on 2019-01-13.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
@SpringBootApplication
@EnableEurekaServer
public class Section04MicroserviceNetflixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section04MicroserviceNetflixEurekaNamingServerApplication.class, args);
	}

}
