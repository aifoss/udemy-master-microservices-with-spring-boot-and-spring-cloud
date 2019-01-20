package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sofia on 2019-01-13.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);

}
