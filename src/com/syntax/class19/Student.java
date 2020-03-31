package com.syntax.class19;

public class Student{
//	write program as a Student class   that has instance variables name and address. 
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student using displayInfo method.
	
	String name, address;
	
	Student(String name, String address){
		this.name=name;
		this.address=address;
	}
	void displayInfo() {
		System.out.println(name+" the address is "+address);
	}
	public static void main(String[] args) {
		Student obj=new Student("SHoklbek", "3885 J Dadvis hwy");
		obj.displayInfo();
	}

	

}
