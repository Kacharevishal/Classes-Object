package com.multipleinterfacepractice;

public class TechLead implements Developer, Trainer{
	

	@Override
	public void teach() {

		System.out.println("This is a Trainer Method");
	}

	@Override
	public void developProjects() {
		System.out.println("This is a Developer Method");
		
	}

}
