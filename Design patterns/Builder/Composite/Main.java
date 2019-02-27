package com.design.composite;



public class Main {

	public static void main(String[] args)
	{
		Components hd = new Leaf(4000, "Hard drive");
		Components mouse = new Leaf(800, "Mouse");
		Components monitor = new Leaf(3000, "monitor");
		Components ram = new Leaf(5000, "RAM");
		Components cpu = new Leaf(6000, "CPU");
		
		Composite mb = new Composite("Mother Board");
		Composite cabinet = new Composite("Cabinet");
		Composite computer = new Composite("Computer");
		Composite peripheral = new Composite("Peripheral");
		
		computer.addComponents(peripheral);
		computer.addComponents(cabinet);
		
		peripheral.addComponents(mouse);
		peripheral.addComponents(monitor);
		cabinet.addComponents(hd);
		cabinet.addComponents(mb);
		
		mb.addComponents(cpu);
		mb.addComponents(ram);
		
		computer.prize();
	}

}
