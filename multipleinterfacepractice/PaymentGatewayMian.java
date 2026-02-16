package com.multipleinterfacepractice;

public class PaymentGatewayMian {

	public static void main(String[] args) {

		UPIPayment up;
		up = new PaymentGateway();
		up.payUsingUPI();
		
		CardPayment cp;
		cp = new PaymentGateway();
		cp.payUsingCard();
	}

}
