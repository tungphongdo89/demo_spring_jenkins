package com.tungphongdo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoSpringJenkinsApplication {
	private static Logger logger = LoggerFactory.getLogger(DemoSpringJenkinsApplication.class);

	@PostConstruct
	public void initial(){
		logger.info("Application started .....");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringJenkinsApplication.class, args);
	}

}
