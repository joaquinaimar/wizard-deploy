package com.wizard.servlet.example.infrastructure.staticserver.domain.config;

import org.junit.Assert;
import org.junit.Test;

public class StaticServerIpVoTest {

	@Test
	public void testIfInNetwork01() {
		StaticServerIpVo staticServerIpVo = new StaticServerIpVo();
		staticServerIpVo.setIpAddress("192.168.1.1");
		staticServerIpVo.setSubnetMask("255.255.255.0");
		Assert.assertTrue(staticServerIpVo.ifInNetwork("192.168.1.237"));
		Assert.assertFalse(staticServerIpVo.ifInNetwork("192.168.13.237"));
	}

	@Test
	public void testIfInNetwork02() {
		StaticServerIpVo staticServerIpVo = new StaticServerIpVo();
		staticServerIpVo.setIpAddress("192.168.1.1");
		Assert.assertTrue(staticServerIpVo.ifInNetwork("192.168.1.1"));
		Assert.assertFalse(staticServerIpVo.ifInNetwork("192.168.13.237"));
	}

}
