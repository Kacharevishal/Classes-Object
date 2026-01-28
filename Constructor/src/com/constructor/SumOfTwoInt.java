package com.constructor;

public class SumOfTwoInt {
	
	//Write a program that uses a parameterized constructor to initialize two integers and display their sum.

	SumOfTwoInt(int a, int b)
	{
		System.out.println("Addition of: "+a+" + "+b+" ="+(a+b));
	}
	
	public static void main(String[] args) {
		
		SumOfTwoInt obj = new SumOfTwoInt(10, 20);
	}	
}
