package com.design.facade;

public class Main {

	public static void main(String[] args) 
	{
        BankAccount account = new BankAccount(12345, 1234);  
        
        account.withdrawlCash(50.00);
    }
}
