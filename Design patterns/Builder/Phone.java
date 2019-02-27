package com.design.builder;

public class Phone 
{
   public String OS;
   public int RAM;
   public int Battery;
 
   
 
   public Phone(String oS, int rAM, int battery) 
   {
	super();
	OS = oS;
	RAM = rAM;
	Battery = battery;
  }



@Override
   public String toString()
   {
	   return "Phone[OS="+OS+",RAM="+RAM+",Battery="+Battery+"]";
   }
   
}
