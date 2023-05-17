package com.tungphongdo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class DemoSpringJenkinsApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(DemoSpringJenkinsApplication.class);

	@Test
	contextLoads() {
		logger.info("Application start executing .....");
		logger.info("Application start executing the second time.....");
		logger.info("Application start executing for testing build pipeline.....");
		Assertions.assertTrue(true);
	}

}
