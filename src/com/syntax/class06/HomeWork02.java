package com.syntax.class06;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Scanner u=new Scanner (System.in);
		char ch;
		String exp;
		System.out.println("Please enter the grade");
		ch=u.next().charAt(0);
		
		switch(ch) {
		case 'A':
			exp="Excellent";
			break;
		case'B':
			exp="Good";
			break;
		case'C':
			exp="Average";
			break;
		case 'D':
			exp="Very Bad";
			break;
			default:
				exp="Unknown";
				break;
				
			
		}
		System.out.println(exp);
		

	}

}
