package com.syntax.class06;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		String country;
		String lan;
		
		System.out.println("Please enter your country name");
		country=u.nextLine();
		
		switch(country) {
		case "Turkey":
			lan="Turkish";
			break;
		case "England":
			lan="English";
			break;
		case "Tajikistan":
			lan="Tajiki";
			break;
		case "Canada":
			lan="Eglish & French";
			break;
			default:
				lan="Unknown";
		}
		System.out.println(country+" speaks "+lan);

	}

}
