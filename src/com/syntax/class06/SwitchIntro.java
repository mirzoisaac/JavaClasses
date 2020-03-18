package com.syntax.class06;

import java.util.Scanner;

public class SwitchIntro {

	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		int day;
		String today;
		System.out.println("Enter the number of the day");
		day=u.nextInt();
		
		switch(day){
		case 1:
			today="Monday";
			break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;
		default:
			today="Not valid";
		}
		System.out.println("Today is "+today);
	
			
			
			
		}
	

	}


