package com.design.facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		 BankAccount account = new BankAccount(12345, 1234);  
		 double result = account.withdrawlCash(500.00);
	      assertEquals(500.00, result);
		 
	}

}
