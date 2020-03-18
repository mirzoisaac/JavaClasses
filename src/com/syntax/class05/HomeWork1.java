package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		Scanner u = new Scanner(System.in);
		int quiz, mid, fin, av;
		
		String grade=null;
		
		
		
		System.out.println("Please enter your quiz score");
		quiz = u.nextInt();
		System.out.println("Please enter your mid term score");
		mid = u.nextInt();
		System.out.println("Please enter your final score");
		fin = u.nextInt();

		av = (quiz + mid + fin) / 3;
		if (av >= 90) {
			grade = "A";
		} else if (av >= 70 && av < 90) {
			grade = "B";
		} else if (av >= 50 && av < 90) {
			grade = "C";
		} else if (av < 50) {
			grade = "F";
		} 
		

		System.out.println("Your grade is " + grade);

	}

}
