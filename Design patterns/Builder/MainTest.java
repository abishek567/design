package com.design.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {


	@Test
	void test() {
		Phone p = new Specifications().setOS("ios").getPhone();
        Phone result = p;
		assertEquals("ios", result);
	}

}
