package com.syntax.class04;

public class NestingIfElse {

	public static void main(String[] args) {
		boolean quizCompleted=true;
		int score=84;
		if(quizCompleted) {
			System.out.println("Let's check your score");
			if(score>90) {
				System.out.println("Great Job!");
			}else if(score>80) {
				System.out.println("Well done!");
			}else if(score>70) {
				System.out.println("Good");
			}else {
				System.out.println("You failed");
			}
			
		}else {
			System.out.println("Do your HW on time");
		}
		

	}

}
