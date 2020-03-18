package com.syntax.class08;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// write a program to ask a user to enter item they want to buy and the price of
				// that item. Every time user enters money accumulate the amount and tell the
				// user how much is left to pay off the amount. If user give more money program
				// should return a change.
				// Whenever a user done with payments program should say “Thank you for
				// shopping!”
				
		Scanner u=new Scanner(System.in);
		String item;
		int price, amount, money, amount1;
		System.out.println("Please enter the item");
		item=u.nextLine();
		System.out.println("Please enter the price");
		price=u.nextInt();
		System.out.println("How much do you have");
		money=u.nextInt();
		
		for(money=money; money<price; money++) {
			
				if(money<price) {
					amount=price-money;
					System.out.println("You should pay "+ amount);
				}else if(money>price) {
					amount1=money-price;
					System.out.println("Your change is "+amount1);
				}
				
				money=u.nextInt();
		}

	}

}
