package com.syntax.class07;

public class HomeWork04 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)
		
		for (int b=20; b<=50; b++) {
			System.out.println(++b);
		}
		//2 way
		int c=20;
		 while(c<=50) {
			 if(c%2!=0) {
				 System.out.println(c);
			 }
			 c++;
		 }
	}

}
