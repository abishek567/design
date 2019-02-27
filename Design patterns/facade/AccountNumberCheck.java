package com.design.facade;

public class AccountNumberCheck 
{
    private int accountNumber = 12345;
    
    public int getAccountNumber() 
    {
    	return accountNumber; 
    }

	public boolean accountActive(int accountCheck) 
	{
		if(accountCheck == getAccountNumber()) {

		return true;}
		else 
		{
			return false;
		}
	}
	
