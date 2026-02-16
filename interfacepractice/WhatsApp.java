package com.interfacepractice;

public class WhatsApp implements Authontication{
	@Override
	public void login(String userName, String password) {
		
		if(userName.equals("VishalKachare") && password.equals("Vishal2748@"))
		{
			 System.out.println("Login Successfully...");
		}
		else
		{
			System.out.println("Please Enter Correct Ingormation...");
		}
	}

	@Override
	public void logout() {
		
		System.out.println("LogOut Successfully...");
	}

}
