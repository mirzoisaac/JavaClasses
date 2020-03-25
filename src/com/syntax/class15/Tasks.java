package com.syntax.class15;

import java.util.Scanner;

public class Tasks {

//	1.Create a method that will take 2 parameters as
//	a numbers and prints which number is larger.

	void num(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	public static void main(String[] args) {

		Tasks nums = new Tasks();
		nums.num(5, 10);

		
		nums.evenOdd(6);

		
		nums.pal("did");
		
		Tasks word1 = new Tasks();
		Scanner u= new Scanner(System.in);
		System.out.println("Enter a country name");
		String coun=u.nextLine();
		word1.hello(coun);
	}

	// Create a method that will take a number and prints whether the number is even
	// or odd.

	void evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is Even");
		} else {
			System.out.println(a + " is Odd");
		}
	}

	// Create a method that will print whether given String is palindrome or not.

	void pal(String x) {

		char[] arr = x.toCharArray();

		String rev = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			rev += arr[i];
		}
		if (x.equalsIgnoreCase(rev)) {
			System.out.println(x + " is Palindrome");
		} else {
			System.out.println(x = " is not a palindrome ");
		}

	}

	// Create a method that will say Hello in different
	// language based on the country that will passed when method is executed.
	
	void hello(String x) {
		String lan;
		switch (x.toLowerCase()){
		case "turkey":
			lan="Merhaba";
			break;
		case "usa":
			lan="Hello";
			break;
		case "japan":
			lan="Koninchiwa";
			break;
		case "czechia":
			lan="Ahoj";
			break;
			default:
				lan="Undefined";
		}System.out.println("Hello in "+x+" is "+lan);
			
	}

}
