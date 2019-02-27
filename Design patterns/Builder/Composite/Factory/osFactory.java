package com.design.factory;

public class OSFactory 
{
    public OS getInstance(String str)
    {
        if(str.equals("open"))
            return new Android();
        else if(str.contentEquals("closed"))
        	return new Ios();
        else 
        	return new Windows();
    }   
}
