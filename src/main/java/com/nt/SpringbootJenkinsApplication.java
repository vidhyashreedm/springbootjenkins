package com.nt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootJenkinsApplication {
	
	public static Logger logger=LoggerFactory.getLogger(SpringbootJenkinsApplication.class);

	@PostConstruct
	public void init()
	{
		logger.info("Application started.....");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed.....");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
