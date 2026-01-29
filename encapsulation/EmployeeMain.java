package com.encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {

		EncapsulationEx1 obj = new EncapsulationEx1();
		
		obj.setEmpId(01);
		obj.setEmpName("Vishal Kachare");
		obj.setEmpSalary(35000);
		
		System.out.println(("Employee Id: ")+(obj.getEmpId()));
		System.out.println(("Employee Name: ")+(obj.getEmpName()));
		System.out.println(("Employee Salary: ")+(obj.getEmpSalary()));	
	}
}
