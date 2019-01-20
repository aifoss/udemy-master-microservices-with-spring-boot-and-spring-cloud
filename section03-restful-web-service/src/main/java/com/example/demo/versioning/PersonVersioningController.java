package com.example.demo.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sofia on 2019-01-01.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
@RestController
public class PersonVersioningController {

	// URI versioning
	
	@GetMapping("/v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 personV2() {
		return new PersonV2("Bob", "Charlie");
	}
	
	// request param versioning

	@GetMapping(value="/person/param", params="version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value="/person/param", params="version=2")
	public PersonV2 paramV2() {		
		return new PersonV2("Bob", "Charlie");
	}
	
	// header versioning
	
	@GetMapping(value="/person/header", headers="X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value="/person/header", headers="X-API-VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2("Bob", "Charlie");
	}
	
	// content negotiation / accept header versioning / mime type versioning
	@GetMapping(value="/person/produces", headers="application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value="/person/produces", headers="application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		return new PersonV2("Bob", "Charlie");
	}
	
}
