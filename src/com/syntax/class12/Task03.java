package com.syntax.class12;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
//		Write a program that reads two people’s first names 
		//and if they expecting boy or girl?
//				Based on the input suggests a name for a baby:
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? boy
//				Suggested baby name: DANRY
//
//				Example Output:
//				Mom’s first name? Mary
//				Dad’s first name? Daniel
//				Boy or Girl? girl
//				Suggested baby name: MAIEL
		
	 Scanner u=new Scanner(System.in);
	 System.out.println("Moms first name?");
	 String mom=u.nextLine();
	 System.out.println("Dads first name?");
	 String dad=u.nextLine();
	 System.out.println("Boy or girl?");
	 String kid=u.nextLine();
	 
	 int half1=dad.length()/2;
	 int half2=mom.length()/2;
	 
	 if(kid.equalsIgnoreCase("Boy")) {
		 String name;
		 name=dad.substring(0, half1).concat(mom.substring(half2));
		 System.out.println("Suggested name is "+name);
	 }else if(kid.equalsIgnoreCase("Girl")) {
		 String name1;
		 name1=mom.substring(0, half2).concat(dad.substring(half1));
		 System.out.println("Suggested name is "+name1);
	 }
	
		

	}
}
