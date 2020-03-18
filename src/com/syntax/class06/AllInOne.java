package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sale;
		double price=0;
		double discounts=0;;
		double finalPrice;
		
		
		System.out.println("Is there a Sale?");
		
		sale=scan.nextLine();
	
		if(sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price of...?");
			price=scan.nextDouble();
			if(price<20) {
				discounts=price*0.1;
			}else if(price>=20 && price<100) {
				discounts=price*0.2;
			}else if(price>=100 && price<500) {
				discounts=price*0.3;
			}else if(price>500) {
				discounts=price*0.5;
			}
			finalPrice=price-discounts;
			System.out.println("After "+discounts+" discounts the price of the item reduced from "+price+" to "+ finalPrice);
		}else{
			System.out.println("No Shopping today");
		}

	}

}
