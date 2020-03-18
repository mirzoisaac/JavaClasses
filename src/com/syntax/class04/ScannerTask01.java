package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask01 {

	public static void main(String[] args) {
		Scanner amount=new Scanner(System.in);
		System.out.println("What is the amount of loan you need?");
		int loan=amount.nextInt();
		if(loan<200000) {
			System.out.println("Your application is approved!");
		}else {
			System.out.println("Your application is rejected!");
		}

	}

}
