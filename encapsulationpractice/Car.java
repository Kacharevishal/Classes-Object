package com.encapsulationpractice;

public class Car {
	
	private Car()
	{
		System.out.println("This is a Private Constructor of Car Class....");
	}
	
	public static Car c1()
	{
		return new Car();
	}

}
