package com.interfacepractice;

public class Instagram implements Authontication{

	@Override
	public void login(String userName, String password) {
		
		if(userName.equals("VishalKachare") && password.equals("Vishal2748@"))
		{
			System.out.println("Login SuccessFull");
		}
		else
		{
			System.out.println("Please Enter Correct Information...");
		}
	}

	@Override
	public void logout() {	
		System.out.println("Logout Successfully...");
	}
}
