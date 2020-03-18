package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {
//		Create an array of animals and store 6 elements into it. 
//		Using 2 different loops print all elements from the array.
		
		String[] ani= {"Dog", "Cat", "Lion", "Koala", "Ostrich","Camel"};
		for(String i:ani) {
			System.out.println(i);
		}
		System.out.println("-------------");
		for (int i=0; i<ani.length; i++) {
			System.out.println(ani[i]);
		}
		

	}

}
