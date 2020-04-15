package com.syntax.class25;

public class MarksTest {

	public static void main(String[] args) {
		Marks studentA=new A(50,60,70);
		int perc=studentA.getPercentage();
		System.out.println(perc+"%");
		
		Marks studentB=new B(50,60,70,80);
		int percB=studentB.getPercentage();
		System.out.println(percB+"%");

	}

}
