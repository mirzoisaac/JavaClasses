package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		/* create a program if user has a cc or not
		 * If user doesnt have a cc then offer.
		 * if they do have one ask what us the balance on the card
		 * if balance of the card is larger than 1000 tell them to pay off immediately
		 * otherwise you can tell them that they can spend more
		 */
		Scanner cc=new Scanner(System.in);
		System.out.println("Do you have a Credit Card?");
		String answer=cc.nextLine();
		if(answer.equalsIgnoreCase("Yes")) {
			System.out.println("What is the balance on the Card?");
			int balance=cc.nextInt();
			if(balance>1000) {
				System.out.println("You should pay off immediately!");
			}else{
				System.out.println("You may continue spending more.");
			}
		}else {
			System.out.println("Would like to apply for a CC?");
			String answer2=cc.nextLine();
			if(answer2.equalsIgnoreCase("Yes")) {
				System.out.println("What type of CC do you want to have? MC or Visa");
				String answer3=cc.nextLine();
				if(answer3.equalsIgnoreCase("MC")) {
					System.out.println("You will have annully 60$ fee");
				}if(answer3.equalsIgnoreCase("Visa")) {
					System.out.println("You will have annully 0$ fee ");
				
					
					
				}
						
				
			}
		
		}

	}

}
