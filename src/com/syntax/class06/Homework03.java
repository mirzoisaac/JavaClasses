package com.syntax.class06;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		double n1, n2, r;
		char o;
		System.out.println("Please enter first number");
		n1=u.nextInt();
		System.out.println("Please choose your operation +/-/*//");
		o=u.next().charAt(0);
		
		System.out.println("Please enter second number");
		n2=u.nextInt();
		
		
		switch(o) {
		case '+':
			r=n1+n2;
			break;
		case '-':
			r=n1-n2;
			break;
		case '*':
			r=n1*n2;
			break;
		case'/':
			r=n1/n2;
			break;
			default:
				r=0;
				
		}
		System.out.println(r);
		

	}
}
