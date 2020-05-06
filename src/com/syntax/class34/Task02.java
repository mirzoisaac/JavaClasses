package com.syntax.class34;

public class Task02 {

	public static void checkUserName(String userName) {
		
		if(userName.length()<5) {
			throw new RuntimeException("Username can not be less than 5 characters");
		}else {
			System.out.println("User name accepted");
		}
		
	}
	
	public static void main(String[] args) {
		checkUserName("shokbek");

	}

}
