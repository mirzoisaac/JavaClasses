package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask02 {

	public static void main(String[] args) {
		Scanner dmv=new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age=dmv.nextInt();
		
		if(age>=18) {
			System.out.println("I can issue a DL for you.");
		}else {
			System.out.println("You should apply first for LP!");
		}

	}

}
