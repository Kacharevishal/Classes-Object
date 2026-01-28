package com.constructor;

public class Student {
	//Create a Student class with variables id and name. Use a constructor to initialize these values and display them.

	Student(int id, String name)
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
	public static void main(String[] args) {

		Student std = new Student(01, "Vishal Kachare");
	}

}
