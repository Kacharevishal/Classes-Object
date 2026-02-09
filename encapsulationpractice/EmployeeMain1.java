package com.encapsulationpractice;

public class EmployeeMain1 {

	public static void main(String[] args) {
		
//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setName("Vishal");
//		emp.setCity("Satara");
//		emp.setSalary("15000");	
	
//		System.out.println(("Employee Id: ")+(emp.getId()));
//		System.out.println(("Employee Name: ")+(emp.getName()));
//		System.out.println(("Employee City: ")+(emp.getCity()));
// 		System.out.println(("Employee Salary: ")+(emp.getSalary()));	
		
		Employee emp = new Employee(1,"Vishal","Nashik","15000");
		System.out.println(emp.toString());
	}
}