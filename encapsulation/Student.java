package com.encapsulation;

public class Student {
	
	private int stdId;
	private String stdName;
	private String stdCity;
	
	
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
}
