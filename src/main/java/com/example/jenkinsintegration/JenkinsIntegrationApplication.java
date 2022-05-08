package com.example.jenkinsintegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsIntegrationApplication {
	public static Logger logger= LoggerFactory.getLogger(JenkinsIntegrationApplication.class);
	@Bean
	public void init(){
		logger.info("Application started by siva");
		System.out.println("Application started by siva");
	}

	public static void main(String[] args) {
		logger.info("Main method");
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
	}

}
