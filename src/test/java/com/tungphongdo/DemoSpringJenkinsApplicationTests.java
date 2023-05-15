package com.tungphongdo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringJenkinsApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(DemoSpringJenkinsApplication.class);

	@Test
	void contextLoads() {
		logger.info("Application start executing .....");
		Assertions.assertTrue(true);
	}

}
