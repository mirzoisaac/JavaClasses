package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.println("Please enter your heights in inches");
		int h=x.nextInt();
		if(h<60) {
			System.out.println("You are short");
		}else if(h>=60 && h<=72) {
			System.out.println("You are medium");
		}else if(h>72) {
			System.out.println("You are tall");
		}

	}

}
