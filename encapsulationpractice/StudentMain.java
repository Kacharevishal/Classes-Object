package com.encapsulationpractice;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student std = new Student();
		System.out.println("Enter The Employee Id: ");
		int id = scan.nextInt();
		std.setStdId(id);
		scan.nextLine();
		
		System.out.println("Enter The Employee Name: ");
		String name = scan.nextLine();
		std.setStdName(name);
		
		System.out.println("Enter The Employee City: ");
		String city = scan.next();
		std.setStdCity(city);
		
		System.out.println(std.toString());
		scan.close();
		
	}

}
