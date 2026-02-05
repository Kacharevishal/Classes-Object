package com.inheritance;

public class FatherSon extends Father{

	public void sonPropery()
	{
		System.out.println("Son Property Around -5 lc ");
	}
	public static void main(String args[])
	{
		FatherSon obj = new FatherSon();
		obj.sonPropery();
		obj.gfProperty();
	}
}
