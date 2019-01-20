package com.example.demo.limit_service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by sofia on 2019-01-02.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
@RestController
public class LimitConfigurationController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		 LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
		 logger.info("LIMIT CONFIGURATION -> {}", limitConfiguration);
		 return limitConfiguration;
	}
	
	@GetMapping("/fault-tolerance-example")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public LimitConfiguration retrieveConfiguration() {
		throw new RuntimeException("Not Available");
	}
	
	public LimitConfiguration fallbackRetrieveConfiguration() {
		return new LimitConfiguration(999, 9);
	}
	
}
