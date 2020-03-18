package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		char[] grades= {'A','B','C','D','E','F'};
		
		for(int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
		
		}
		
		
		//for-each loop or advanced loop
		
		for( char i:grades) {
			System.out.print(i+" ");
		}
		
		System.out.println("------------------------");
		
		String[] fruits= {"Kiwi","Apple", "Banana", "Apricot"};
		
		for(String fruit:fruits) {
			if (fruit.equals("Apple")) {
			System.out.println(fruit+" is your favorite fruit");
			}else {
				System.out.println(fruit);
			}
		}
		System.out.println("-------------------");
		for(int x=0; x<fruits.length; x++) {
			System.out.println(fruits[x]);
		}
		
		

	}

}
