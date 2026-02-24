package com.string;

public class StringPractice {

	public static void main(String[] args) {
		
		String str1 = "Vishal";
		String str2 = "Vishal";
		
		String str5 = str1;
		String str7 = str2;
		
		String str3 = new String("Vishal");
		String str4 = new String("Vishal");
		
		String str6 = str3;	
		
		System.out.println(str1 == str2); // True
	
		System.out.println(str1.equals(str2)); // True
		
		System.out.println(str3 == str4); // False
		
		System.out.println(str3.equals(str4)); // True
	 
		System.out.println(str1 == str5); // True
		
		System.out.println(str3 == str6); // True
		
		System.out.println(str5 == str7); // True
		
	}

}
