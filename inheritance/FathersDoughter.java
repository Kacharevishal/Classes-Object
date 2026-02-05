package com.inheritance;

public class FathersDoughter extends Father{

	public void doughterProperty()
	{
		System.out.println("Doughter property around 1.5 cr");
	}
	public static void main(String[] args) {

		FathersDoughter obj = new FathersDoughter();
		
		obj.doughterProperty();
		obj.fatherProperty();
		obj.gfProperty();
	}

}
