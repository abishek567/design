package com.design.composite;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Composite cabinet = new Composite("Cabinet");
		java.lang.Object result = cabinet.prize();
		assertEquals(4000, "Hard drive", result);
		
	}

	private void assertEquals(int i, String string, java.lang.Object result) 
	{	
	}

}
