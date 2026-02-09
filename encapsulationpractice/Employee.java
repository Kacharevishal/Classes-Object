package com.encapsulationpractice;
public class Employee {
	
	private int empId;
	private String empName;
	private String empCity;
	private String empSalary;
	public void setId(int empId)
	{
		this.empId = empId;
	}
	
	public int getId()
	{
		return empId;
	}
	
	public void setName(String empName)
	{
		this.empName = empName;
	}
	
	public String getName()
	{
		return empName;
	}
	
	public void setCity(String empCity)
	{
		this.empCity = empCity;
	}
	
	public String getCity()
	{
		return empCity;
	}
	
	public void setSalary(String empSalary)
	{
		this.empSalary = empSalary;
	}
	
	public String getSalary()
	{
		return empSalary;
	}
	
	public Employee()
	{
		
	}
	
	public Employee(int empId, String empName, String empCity, String empSalary)
	{
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empSalary=" + empSalary
				+ "]";
	}
}
