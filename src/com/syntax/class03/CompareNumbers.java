package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		double a=300;
		double b=200;
		
		if(a>b) {
			System.out.println("Double value "+a+" is larger than "+ b);
		}else if(a<b){
			System.out.println("Double value "+a+" is smaller than "+ b);
		}else {
			System.out.println("nothing");
		}
		System.out.println("_______________________");
		//declare variable for da y and then based on the value
		//we will provide output
		int day=4;
		
		if(day==1) {
			System.out.println("It is Monday, no class today");
		}else if(day==2) {
			System.out.println("It is Tuesday, we have SDLC Class");
		}else if(day==3) {
			System.out.println("It is Wednesday, we have SDLC Class");
		}else if(day==4) {
			System.out.println("It is Thursday, we have Review Class");
		}else if(day==5) {
			System.out.println("Its Friday, no class");
		}else {
			System.out.println("Invalid weekday");
		}
			

	}
	

}
