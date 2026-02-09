package com.encapsulationpractice;

public class Student {
	
	private int stdId;
	private String stdName;
	private String stdCity;
	
	public Student()
	{
		
	}
	
	public Student(int stdId, String stdName, String stdCity) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCity = stdCity;
	}

	public void setStdId(int setId)
	{
		this.stdId = setId;
	}

	public int getId()
	{
		return stdId;
	}
	
	public void setStdName(String stdName)
	{
		this.stdName = stdName;
	}
	
	public String getStdName()
	{
		return stdName;
	}
	
	public void setStdCity(String stdCity)
	{
		this.stdCity = stdCity;
	}
	
	public String getStdCity()
	{
		return stdCity;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCity=" + stdCity + "]";
	}
}
