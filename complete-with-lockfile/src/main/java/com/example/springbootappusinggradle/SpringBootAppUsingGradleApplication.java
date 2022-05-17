package com.example.springbootappusinggradle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppUsingGradleApplication {

	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(SpringBootAppUsingGradleApplication.class);
		logger.info("Hello World!");
		SpringApplication.run(SpringBootAppUsingGradleApplication.class, args);
	}

}
