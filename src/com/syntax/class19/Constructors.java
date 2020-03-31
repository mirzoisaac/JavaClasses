package com.syntax.class19;

public class Constructors {
	Constructors(){
		this(1);// always must be 1st line inside the constructor
		//this (1,2); CE: this is located on 2nd line
		System.out.println("Hi");
	}
	Constructors(int x){
		this(1,2);
		System.out.println("Hello");
	}
	Constructors(int x, int y){
		System.out.println("How are you?");
	}
	public static void main(String[] args) {
		Constructors obj=new Constructors(1,2);
		new Constructors();
	}

}
