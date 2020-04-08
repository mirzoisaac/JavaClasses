package com.syntax.class21;

public class Shokl {
	
	private static void method() {
		System.out.println("I love Java");
	}
	private static void method(int times) {
		System.out.println("I love Java "+times+" times");
	}
	private static void method(String str) {
		System.out.println("I love Java because of "+str);
	}
	public static void main(String[] args) {
		method();
		method(100);
		method("Syntax");
	}

}
