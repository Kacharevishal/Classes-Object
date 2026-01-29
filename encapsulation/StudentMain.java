package com.encapsulation;

public class StudentMain {

	public static void main(String[] args) {

		Student std = new Student();
		
		std.setStdId(01);
		std.setStdName("Vishal Kachare");
		std.setStdCity("Pune");
		
		System.out.println(("Student Id: ")+(std.getId()));
		System.out.println(("Student Name: ")+(std.getStdName()));
		System.out.println(("Student City: ")+(std.getStdCity()));
	}

}
