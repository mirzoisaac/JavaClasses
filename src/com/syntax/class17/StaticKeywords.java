package com.syntax.class17;

public class StaticKeywords {
	
	
	//create a template for a Phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	//return type, name, parameters
	
	
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+ " with touch screen "+touchScreen);
	}
	void displaySpecifications() {
		System.out.println("we build phone with "+memory+"GB memory in "+color+" color");
	}
	public static void main(String[] args) {
		//accessing static variables in a static way
		brand="iPhone";
		touchScreen=true;
		
		//accessing instance variables through the instance  of the class
		StaticKeywords obj=new StaticKeywords();
		obj.color="grey";
		obj.memory=64;
		//obj.displayGeneralInfo();
		obj.displaySpecifications();
		
		
		displayGeneralInfo();
	}
	
	
	

}
