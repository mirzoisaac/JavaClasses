package com.syntax.class19;

public class Book {
//	write program as a Book class   that will have 2 Constructors. While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed
	
	String str;;
	int b;
	
	Book(){
		this("hello", 2);
		System.out.println("First constructor");
		System.out.println("Print out is "+str+" "+b);
	}
	Book (String str, int b){
		this.str=str;
		this.b=b;
		
		System.out.println("Second constructor");
	}
	
	public static void main(String[] args) {
		Book obj=new Book();
	}
	

}
