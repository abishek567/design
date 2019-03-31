package com.design.facade;

import java.util.Scanner;

public class AccountManager{
	
	Scanner scanner = new Scanner(System.in);
	

    BankAccount account; 
	
	int action;
	
	public AccountManager(){
		
		 account = new BankAccount(12345, 1234);
        System.out.println("What action do you wanna perform;");
        System.out.println("1 for withdrawing money /n 2 for depositing money");
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        selectAction(f);
        }
	
	public void selectAction(int num){
		this.action = num;
		if(action == 1)
		{
			System.out.println("Enter amount to withdraw");
			double d = scanner.nextFloat();
			account.withdrawlCash(d);
		}
		else if(action == 2){
			System.out.println("Enter amount to deposit");
			double f = scanner.nextFloat();
			account.depositCash(f);
		}
	}

}
