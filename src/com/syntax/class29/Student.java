package com.syntax.class29;

public class Student {
	String name, studentID;
	
	Student(String name, String studentID){
		this.name=name;
		this.studentID=studentID;
	}
	
	public void display(){
		System.out.println("Student Name: "+name+" Student ID: "+studentID);
		
	}

}
class StudentA extends Student{
	
	StudentA(String name, String studentID){
		super(name,studentID);
	}
}
class StudentB extends Student{
	
	StudentB(String name, String studentID){
		super(name,studentID);
	}
}
class StudentC extends Student{
	
	StudentC(String name, String studentID){
		super(name,studentID);
	}
}
