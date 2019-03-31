package com.design.facade;

public class BankAccount 
{
	private int accountNumber;
	private int securutyCode;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundsChecker;
	
	public BankAccount(int newAcntNumber, int newCode) 
	{
		accountNumber = newAcntNumber;
		securutyCode = newCode;
		
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundsChecker = new FundsCheck();
		
	}
	public BankAccount() {}
	
	public int getAccountNumber(){return accountNumber;}
	
	public int getSecurityCode(){return securutyCode;}
	
	public void withdrawlCash(double cashToGet)
	{
		if (acctChecker.accountActive(accountNumber)&&
				codeChecker.isCodeCorrect(securutyCode)&&
				fundsChecker.haveEnoughMoney(cashToGet))
		{
			System.out.println("transaction complete\n");
		}
		else {
			System.out.println("transaction failed\n");
		}
	}
	public void depositCash(double cashToDeposit){

		if (acctChecker.accountActive(accountNumber)&&
				codeChecker.isCodeCorrect(securutyCode)&&
				fundsChecker.haveEnoughMoney(cashToDeposit))
		{
			System.out.println("transaction complete\n");
		}
	}
}





