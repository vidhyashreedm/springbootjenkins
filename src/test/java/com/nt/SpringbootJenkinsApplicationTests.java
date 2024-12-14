package com.nt;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootJenkinsApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing....");
		assertEquals(true,true);
	}

}
