package com.design.singleton;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Singleton s = new Singleton();
		Singleton result = s.getInstance();
		Assert.assertEquals("done" , result);
	}

}
