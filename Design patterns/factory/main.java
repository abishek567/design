package com.design.factory;

public class Main {

	public static void main(String[] args) 
	{
	    OSFactory os = new OSFactory();
	    OS obj = os.getInstance("open");
	    obj.specs();
	    
	    OSFactory os1 = new OSFactory();
	    OS obj1 = os.getInstance("closed");
	    obj1.specs();
	    
	    OSFactory os2 = new OSFactory();
	    OS obj2 = os.getInstance("gfdg");
	    obj2.specs(); 
	}

}
