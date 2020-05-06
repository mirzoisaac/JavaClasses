package com.syntax.class34;

public class Task01 {
//	Create a method to check age eligibility that will throw a runtime exception. 
//	Method should throw an exception age is less than 16
	
	public static void checkAge(int age) {
		
		if(age<16) {
			throw new RuntimeException("Age is not eligible");
		}else {
			System.out.println("Age is eligible");
		}
	}

	public static void main(String[] args) {
		
		checkAge(15);
		

	}

}
