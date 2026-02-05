package com.inheritance;

public class AmazonProduct extends AmazonShop{
	
	public void amazonProduct()
	{
		System.out.println("It is Provie a Good Quality Products...");
	}

	public static void main(String[] args) {

		AmazonProduct obj = new AmazonProduct();
		
		obj.amazonProduct();  // This is a child Method.
		obj.amazonShopping(); // This is a parent/child Method.
		obj.productProvide(); // This is a Parent Method.
		
	}

}
