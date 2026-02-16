package com.multipleinterfacepractice;

public class EmployeeMian {

	public static void main(String[] args) {

		Trainer t;
		t = new TechLead();
		t.teach();
		
		Developer d;
		d = new TechLead();
		d.developProjects();
	}

}
