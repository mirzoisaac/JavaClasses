package com.syntax.class04;

import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		Scanner points=new Scanner(System.in);
		System.out.println("How many years did you work?");
		int years=points.nextInt();
		System.out.println("What was your annual salary?");
		int salary=points.nextInt();
		if(years>=5) {
			System.out.println("You are eligible for the bonus.");
			if(salary>50000) {
				System.out.println("Your bonus is 5000.");
			}else {
				System.out.println("Your bonus is 3000.");
			}
		}else {
			System.out.println("You are NOT eligible for the bonus.");
		}

	}

}
