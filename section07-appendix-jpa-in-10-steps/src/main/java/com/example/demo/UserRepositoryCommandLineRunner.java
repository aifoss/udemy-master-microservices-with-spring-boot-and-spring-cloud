package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.service.UserRepository;

/**
 * Created by sofia on 2019-01-27.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jill", "Admin");
		userRepository.save(user);
		LOGGER.info("New user is created: {}", user);
		
		Optional<User> userWithIdOne = userRepository.findById(1L);
		LOGGER.info("User with id 1 is retrieved: {}", userWithIdOne);
		
		List<User> users = userRepository.findAll();
		LOGGER.info("All users: {}", users);
	}

}
