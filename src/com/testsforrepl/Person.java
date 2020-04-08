package com.testsforrepl;
public class Person{
	  String name, lastName;
	  int age;
	  Person(String name, String lastName, int age){
	    this.name=name;
	    this.lastName=lastName;
	    this.age=age;
	  }
	}
	class Employee extends Person{
	  int salary;
	  Employee(String name, String lastName, int age, int salary){
	    super(name,lastName,age);
	    this.salary=salary;
	  }
	  void action(){
	  System.out.println(name+" "+lastName+" "+age+" "+salary);
	  }
	}
	class Student extends Employee{
	  int grade;
	  Student(String name, String lastName, int age, int grade){
	    super(name,lastName,age,age);
	    this.grade=grade;
	  }
	  void action(){
	  System.out.println(name+" "+lastName+" "+age+" "+grade);
	  }
	}
	class Retiree extends Student{
	  String seniorActivity;
	  Retiree(String name, String lastName, int age, String seniorActivity){
	    super(name,lastName,age,age);
	    this.seniorActivity=seniorActivity;
	  }
	  void action(){
	  System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	  }
	}