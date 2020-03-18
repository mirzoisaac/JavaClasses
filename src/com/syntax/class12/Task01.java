package com.syntax.class12;

public class Task01 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS)
	String str="Sunday";
	
		char letter;
        for(int i=str.length()-1; i>=0; i--) {
            
            letter=str.charAt(i);
            System.out.print(letter);
        }
        System.out.println();

	}
}
