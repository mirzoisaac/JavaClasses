package com.syntax.class04;

public class Task01 {

	public static void main(String[] args) {
		boolean diploma = false;
		double score = 4.0;

		if (diploma) {
			System.out.println("Congratulations!");
			if (score >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Take you degree please");
		}
	}
}
