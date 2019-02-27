package com.design.builder;

public class Specifications 
{
	public String OS;
	   public int RAM;
	   public int Battery;
	
	public Specifications setOS(String oS) {
		OS = oS;
		return this;
	}
	public Specifications setRAM(int rAM) {
		RAM = rAM;
		return this;
	}
	public Specifications setBattery(int battery) {
		Battery = battery;
		return this;
	}
	
	public Phone getPhone()
	{
		return new Phone(OS, Battery, Battery);
	}

	
}
