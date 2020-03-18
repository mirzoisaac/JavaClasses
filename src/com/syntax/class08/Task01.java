package com.syntax.class08;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3

		for (int i = 0; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;

			}
			System.out.print(i);
		}

		// Create a program that will be asking user to apply for a credit card 10
		// times.
		// As soon you get an “yes” from a user program should stop asking.

		System.out.println("---------2----------");
		Scanner u = new Scanner(System.in);

		for (int i = 1; i < 11; i++) {

			System.out.println("Do you want to apply for CC?");
			String cc = u.nextLine();

			if (cc.equalsIgnoreCase("Yes")) {
				System.out.println("Congrats");
				break;
			}

		}
		System.out.println("-----------3---------");

		// write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.

//		System.out.println("enter a  number please");
//		int a=u.nextInt();
		int y = 0;
		int p = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("enter the ranges number please");
		int a = n.nextInt();
		int b = n.nextInt();

		for (a = a; a < b; a++) {
			if (a % 2 == 0) {
				y = y + a;

			} else {
				p = p + a;
			}

		}
		System.out.println(y);
		System.out.println(p);

		System.out.println("-------------4--------------");

		
		

	}

}
