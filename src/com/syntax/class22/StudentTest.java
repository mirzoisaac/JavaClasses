package com.syntax.class22;

public class StudentTest {

	public static void main(String[] args) {
	Student	obj=new Student();
	obj.study("Student");
	obj.party(4);
	
	SyntaxStudent syntaxS=new SyntaxStudent();
	syntaxS.run();
	syntaxS.study("Syntax Student");
	syntaxS.party(5);
	System.out.println("------------");
	Student collegeS=new CollegeStudent();
	collegeS.study("College students");
	collegeS.party(6);

	}

}
