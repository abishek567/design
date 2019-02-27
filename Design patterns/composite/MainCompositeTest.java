package com.design.composite;

import org.junit.jupiter.api.Test;

class MainCompositeTest {

	@Test
	void test() 
	{
		Components ram = new Leaf(5000, "RAM");
		Object result = ram.prize();
		assertEquals(5000, "RAM", result);
	}

	private void assertEquals(int i, String string, Object result) {
		// TODO Auto-generated method stub
		
	}

}
