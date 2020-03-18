package com.syntax.class07;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int luckyN=17;
		int number;
		
		
		do {
			System.out.println("Please enter any number from 1-20");
			number=u.nextInt();
			
		}while(number!=luckyN); 
		System.out.println("Got it");

	}

}
