package com.example.demo.versioning;

/**
 * Created by sofia on 2019-01-01.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
public class PersonV2 {
	
	private Name name;

	public PersonV2(String firstName, String lastName) {
		this(new Name(firstName, lastName));
	}
	
	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
}
