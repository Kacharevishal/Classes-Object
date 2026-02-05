package com.inheritance;

public class GoogleDrive extends Google{

	public void gDriverStorage()
	{
		System.out.println("Google Drive Use full for store the files or any type of Information...");
	}
	
	public void gDriverUse()
	{
		System.out.println("Google Drive Use Very simple & clean...");
	} 
	
	public static void main(String[] args) {
		
		GoogleDrive obj = new GoogleDrive();
		
		// This is a Multilevel Inheritance.
		
		obj.gDriverStorage(); // This is a child class Method...
		obj.gDriverUse();  // This is a child class Method... 
		obj.provideServices(); // This is a parent class method...
		obj.provideWorldInfo(); // This is a parent class method...
	}
}
