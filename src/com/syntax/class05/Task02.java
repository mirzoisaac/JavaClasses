package com.syntax.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner y=new Scanner(System.in);
		
		System.out.println("Enter the number of the day");
		int day=y.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("It is weekday");
		}else if(day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
	

	}

}
