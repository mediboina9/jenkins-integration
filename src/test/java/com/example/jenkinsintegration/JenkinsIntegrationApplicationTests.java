package com.example.jenkinsintegration;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsIntegrationApplicationTests {
	public static Logger logger= LoggerFactory.getLogger(JenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Testing started.....");

	}

}
