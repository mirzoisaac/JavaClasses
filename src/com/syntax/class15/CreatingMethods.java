package com.syntax.class15;

public class CreatingMethods {
	
//	int marks(int a) {
//		int marks=a;
//		return marks;
//	}
	char grade(int marks) {
		char grade = 0;
		if (marks>90) {
			grade='A';
		}else if(90>marks && marks>80) {
			grade='B';
		}else if(80> marks && marks>70) {
			grade='C';
		}
		return grade;
	}
	public static void main (String[] args) {
		CreatingMethods obj=new CreatingMethods();
//		int marks=obj.marks(75);
		char grade=obj.grade(95);
		
		System.out.println(grade);
		System.out.println(obj.grade(65));
	}

}
