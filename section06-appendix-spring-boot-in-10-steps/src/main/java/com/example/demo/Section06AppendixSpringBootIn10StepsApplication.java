package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by sofia on 2019-01-27.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
@SpringBootApplication
public class Section06AppendixSpringBootIn10StepsApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Section06AppendixSpringBootIn10StepsApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Section06AppendixSpringBootIn10StepsApplication.class, args);
		
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			LOGGER.info("Bean: {}", beanName);
		}
	}

}
