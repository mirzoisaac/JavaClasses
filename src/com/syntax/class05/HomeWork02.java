package com.syntax.class05;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		String month, season = null;
		System.out.println("Please enter your month");
		month=u.nextLine();
		
		if(month.equals("March") || month.equals("April") || month.equals("May") ) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Autumn";
		}else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season="Winter";
		}
		System.out.println("You were born in " + season);

	}

}
