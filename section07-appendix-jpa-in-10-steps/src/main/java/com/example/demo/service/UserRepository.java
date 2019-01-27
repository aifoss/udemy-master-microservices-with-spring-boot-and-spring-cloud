package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

/**
 * Created by sofia on 2019-01-27.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
}
