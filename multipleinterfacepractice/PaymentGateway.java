package com.multipleinterfacepractice;

public class PaymentGateway implements UPIPayment,CardPayment{

	@Override
	public void payUsingCard() {

		System.out.println("Pay Using Card Method");
	}

	@Override
	public void payUsingUPI() {

		System.out.println("Pay Using UPI Method");
	}

}
