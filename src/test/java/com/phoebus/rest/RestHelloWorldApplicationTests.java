package com.phoebus.rest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import de.flatspection.FlatSpectionWSApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FlatSpectionWSApplication.class)
@WebAppConfiguration
public class RestHelloWorldApplicationTests {

	@Test
	public void contextLoads() {
	}

}
