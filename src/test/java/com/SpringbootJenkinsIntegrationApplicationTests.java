package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest

class SpringbootJenkinsIntegrationApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringbootJenkinsIntegrationApplicationTests.class);
	@Test
	public contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
