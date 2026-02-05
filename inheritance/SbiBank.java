package com.inheritance;

public class SbiBank extends Bank {

	public void zeroBalanceAcc() 
	{
		System.out.println("SBI Provide a Zero Balance Accounts...");
	}
	
	public static void main(String[] args) {

		SbiBank obj = new SbiBank();
		
		//This is a Single Inheritance.
		
		obj.zeroBalanceAcc();  // This is a child Class Method...
		obj.savingAccount();  // This is a Parent Class Method...
		obj.loanAccount();   // This is a Parent Class Method...
		obj.salaryAccount();  // This is a Parent Class Method...	
	}
}
