package com.syntax.class22;

public class Student {
	String str;
	int hour;
	void study(String str) {
		this.str=str;
		System.out.println(this.str+" study");
	}
	void party(int hour) {
		this.hour=hour;
		System.out.println(str+" students party "+hour);
	}
}
class SyntaxStudent extends Student{
	void study(String str) {
		super.str=str;
		System.out.println(super.str+" study");
	}
	void party(int hour) {
		super.hour=hour;
		System.out.println(super.str+" students party "+hour);
	}	
	void run() {
		System.out.println("Students run");
	}
}
class CollegeStudent extends Student{
	void study(String str) {
		this.str=str;
		System.out.println(super.str+" study 2");
	}
	void party(int hour) {
		super.hour=hour;
		System.out.println(str+" students party "+hour);
	}
	void play() {
		System.out.println("Students play");
	}
}
class SchoolStudent extends Student{
	void study(String str) {
		super.str=str;
		System.out.println(super.str+" study");
	}
	void party(int hour) {
		super.hour=hour;
		System.out.println(str+" students party "+hour);
	}	
	void sleep() {
		System.out.println("Students sleep");
	}
}