package com.javatpoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExample {
	public static void main(String[] args) {
		final Logger logger = LogManager.getLogger(SpringBootExample.class);
		SpringApplication.run(SpringBootExample.class, args);
		logger.info("wlecome to logger");
		logger.warn("logger check");
	
	}
}