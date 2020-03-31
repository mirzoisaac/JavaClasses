package com.syntax.class18;

public class Task01 {
	//Write a program that will have a constructor: one with parameters and second without any parameters. 
	//Create a separate Test class where you will execute both of the constructors
	
	Task01(){
		System.out.println("Without parameters");
	}
	Task01(String str, int i){
		System.out.println("String is "+str+"integer is "+i);
	}

}
