package com.constructor;

public class SimpleConstructor {
	
//	Write a Java program with a default constructor that prints
//	"Object created" when an object is instantiated.

	SimpleConstructor()
	{
		System.out.println("This is a Simple Constructor....");
	}
	public static void main(String[] args) {

		SimpleConstructor obj = new SimpleConstructor();
	}

}
