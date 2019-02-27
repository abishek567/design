package com.design.facade;

public class SecurityCodeCheck 
{
	 private int securutyCode = 1234;
	    
	    public int getSecurityCOde()  
	    {
	    	return securutyCode; 
	    }

		public boolean isCodeCorrect(int securityCode) {
			if(securityCode == getSecurityCOde()) {

				return true;}
				else 
				{
					return false;
				}
		}
}
