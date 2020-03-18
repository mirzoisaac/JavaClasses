package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		String name;
		int num=2;
//		num=u.nextInt();
		
		while(num<=5) {
			
		System.out.println("Whats your name?");
		name=u.nextLine();
		
		System.out.println("Good afternoon "+ name);
		num++;
		}
		
		System.out.println("------------------------");
		
		
		
		
		

	}

}
