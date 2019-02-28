package com.design.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() 
	{
		OSFactory os = new OSFactory();
		OS result = os.getInstance("hgf");
		assertEquals("Outdated OS", result);
	}

}
