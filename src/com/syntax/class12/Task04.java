package com.syntax.class12;

public class Task04 {

	public static void main(String[] args) {
//		Create a String that will hold a sentence. 
//		Write a program to get a new String without any spaces.
		
		String sen="I love Java and Eclipse";
		sen=sen.replace(" ", "");
		System.out.println(sen);
		
		System.out.println("------2--------");
		
//		Create a String that should be combination of letters, 
//		numbers and special characters. 
//		Find out how many alpha characters are there in the String.
		
		String let="Koala 1234 &%$mirzo";
		
		let=let.replaceAll("[^A-Za-z]", "");
		System.out.println(let.length());
		
		System.out.println("--------3----------");
		
//		You have a String a=“Is it Saturday? Is it raining? Do we have a Java Class today?” 
//		How would you find out how many sentences are in that String?
		String a="Is it saturday? Is it raining? Do we have Java Class today?";
		a=a.replace("?", "!");
		String[] newSen=a.split("!");
		System.out.println(newSen.length);


	}

}
