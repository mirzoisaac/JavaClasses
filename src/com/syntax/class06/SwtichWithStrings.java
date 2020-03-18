package com.syntax.class06;

import java.util.Scanner;

public class SwtichWithStrings {

	public static void main(String[] args) {
		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner(System.in);
		System.out.println("Plese enter your country");
		country=scan.nextLine();
		
		switch(country) {
		case "Morocco":
			favoriteFood="couscous";
			break;
		case "Turkey":
			favoriteFood="baklava";
			break;
		case "Tajikistan":
			favoriteFood="Osh";
			break;
			default:
			favoriteFood="Unknown";
		}
		System.out.println("Favourite food of "+country+" is "+favoriteFood);

	}

}
