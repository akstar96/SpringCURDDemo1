package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrud1Application {
private static final Logger logger= LogManager.getLogger(SpringBootCrud1Application.class);
	public static void main(String[] args) {
		logger.info("user in main application");
		SpringApplication.run(SpringBootCrud1Application.class, args);
		logger.warn("you are under servilance");
	}

}
