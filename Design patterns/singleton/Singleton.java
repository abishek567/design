package com.design.singleton;

public class Singleton
{
   private volatile static Singleton obj;

Singleton() {}
   
   public  Singleton getInstance()
   {
	   if(obj==null) {
		   synchronized(Singleton.class)
		   {
			   if(obj==null)
			   {
				   obj=new Singleton();
				   System.out.println("done!");
			   }
		   }
	   }
	   return obj;
   }
  
}
