package com.design.builder;

public class Main {

	public static void main(String[] args) 
	{
	 Phone p = new Specifications().setOS("ios").setBattery(3000).getPhone();
	 System.out.println("specificatoins of  mobile " + p);
	 
	}

}
