package com.design.facade;

public class FundsCheck 
{
    private double cashInAccount = 1000.00;
    
    public double getCashInAccount() 
    { 
    	return cashInAccount;
    }
    public boolean cashDeposit(double cashdep)
    {
    	cashInAccount += cashdep; 
    	System.out.println("Deposit complete; current balance ;" +  cashInAccount);
        return true;
    }
    
    public void cashDeduction(double cashWithdrawn)
    {cashInAccount -= cashWithdrawn; }
    
    public boolean haveEnoughMoney(double cashToWithdrawl)
    {
    	if(cashToWithdrawl > cashInAccount)
    	{
    		System.out.println("Insufficient balance");
    		return false;
    	}
    	else
    	{
    		cashDeduction(cashToWithdrawl);
    		System.out.println("withdrawal complete;current balance " + cashInAccount);
    		return true;
    	}
    }
    
}
