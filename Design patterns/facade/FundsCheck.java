package com.design.facade;

public class FundsCheck 
{
    private double cashInAccount = 1000.00;
    
    public double getCashInAccount() 
    { 
    	return cashInAccount;
    }
    public void decreaseCash(double cashWithdrawn)
    {
    	cashInAccount -= cashWithdrawn;
    }
    
    public boolean haveEnoughMoney(double cashToWithdrawl)
    {
    	if(cashToWithdrawl > cashInAccount)
    	{
    		System.out.println("Insufficient balance");
    		return false;
    	}
    	else
    	{
    		decreaseCash(cashToWithdrawl);
    		System.out.println("withdrawal complete;current balance " + cashInAccount);
    		return true;
    	}
    }
    
}

