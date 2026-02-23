package com.staticpractice;

public class RunPreferance {

	static int a = 10; //static variable 2
	String name = "Ram"; //non-static variable 6
	
	{
		System.out.println("This is a Non static block...");  //non-static block  4
	}
	
	static  
	{
		System.out.println("This is a static block"); // static block   1
	}
	
	public RunPreferance()
	{
		System.out.println("This is a construstor"); // constructor 5
	}
	public static void display()
	{
		System.out.println("This is a static Method..."); //static method  3
	}
	
	public void show()
	{
		System.out.println("This is a non static method..."); // non no static method 7
	}
	
	public static void main(String[] args) {
		
		System.out.println(RunPreferance.a);
        RunPreferance.display();
        
        RunPreferance rp = new RunPreferance();
        System.out.println(rp.name);
        rp.show();
		
	}
	
}
