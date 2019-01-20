package com.example.demo.swagger;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by sofia on 2019-01-01.
 */

/**
 * Source:
 * Udemy: Master Microservices with Spring Boot and Spring Cloud
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static final Contact DEFAULT_CONTACT = new Contact(
			"API Support", "http://www.api-support.com", "api-support@gmail.com");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			"Awesome API Title", // title
			"Awesome API Description", //description
			"1.0", // version
			"urn:tos", // termsOfServiceUrl
			DEFAULT_CONTACT, // contact
			"Apache 2.0", // license
			"http://www.apache.org/licenses/LICENSE-2.0", // licenseUrl
			Collections.emptyList()); // vendorExtensions
	
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
			new HashSet<>(Arrays.asList("application/json", "application/xml"));
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}
	
}
