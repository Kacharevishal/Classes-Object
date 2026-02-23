package com.staticpractice;

import java.util.Scanner;

public class FinalKeyWPractice {

	static int age;
	public void myInfo(final int age)
	{
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age1 = scan.nextInt();
		
		FinalKeyWPractice a = new FinalKeyWPractice();
		a.age =age1;
		
		System.out.println("Your Age: "+age);
	}
}
