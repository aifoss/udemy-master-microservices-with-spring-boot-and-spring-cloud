package com.example.demo.limit_service;

/**
 * Created by sofia on 2019-01-02.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
public class LimitConfiguration {
	
	private int maximum;
	private int minimum;
	
	protected LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}
	
}
