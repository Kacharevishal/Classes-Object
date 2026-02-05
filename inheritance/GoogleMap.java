package com.inheritance;

public class GoogleMap extends Google{

	public void provideLocation()
	{
		System.out.println("Google provides Every Location...");
	}
	
	public void provideLoactionInfo()
	{
		System.out.println("Google provides Every Location whith Correct Information...");
	}
	
	public static void main(String args[])
	{
		GoogleMap obj = new GoogleMap();
		
		// This is a Multilevel Inheritance.
		
		obj.provideLoactionInfo(); // This is a method of child class.
		obj.provideLocation();  // This is a method of child class
		
		obj.provideServices(); // This is a method of parent class
		obj.provideWorldInfo(); // This is a method of parent class
	}
}
