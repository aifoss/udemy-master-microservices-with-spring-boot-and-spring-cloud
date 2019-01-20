package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by sofia on 2019-01-02.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
@SpringBootApplication
@EnableConfigServer 
public class Section04MicroserviceSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section04MicroserviceSpringCloudConfigServerApplication.class, args);
	}

}
