package com.interfacepractice;

public class SimpleCalculator implements Calculator{

	@Override
	public void additrion() {
		int ans = num1+num2;
		System.out.println("Addition of "+num1+" + "+num2+" = "+ans);
	}

	@Override
	public void substraction() {
		int ans = num1-num2;
		System.out.println("Substraction of "+num1+" - "+num2+" = "+ans);
		
	}

	@Override
	public void multiplication() {
		int ans = num1*num2;
		System.out.println("Multiplication of "+num1+" * "+num2+" = "+ans);
	}

	@Override
	public void division() {
		int ans = num1/num2;
		System.out.println("Division of "+num1+" / "+num2+" = "+ans);
	}

	
}
