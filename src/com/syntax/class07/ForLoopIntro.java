package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		for (int c = 1; c <= 2; c++) {
			System.out.println("Good morning");
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		for (int i = 0; i <= 50; i += 10) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		// what is the output?
		int sum = 0;
		for (int i = 1; i < 5; i++) {
			sum = sum + i;
			//0=0+1
			//1=1+2
			//3=3+3
			//6=6+4
					
			
		}
		System.out.println(sum);
	}
}
