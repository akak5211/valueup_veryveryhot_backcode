package com.valueup.veryveryhot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeryveryhotApplication {
	
	public static final String APPLICATION_LOCATIONS = "spring.config.location="
    + "classpath:application.yml,"
    + "classpath:aws.yml";

	public static void main(String[] args) {
		SpringApplication.run(VeryveryhotApplication.class, args);
	}

}
