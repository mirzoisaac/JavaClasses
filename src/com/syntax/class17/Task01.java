package com.syntax.class17;

import java.util.Scanner;

public class Task01 {
	
	//Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
    //Method should be visibly only within same package and accessible by the creating an instance of the class.
	
	protected int SumOfArr(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	//Create a method that will take a String as a parameter and returns reverse String. 
	//Method should be available to all classes within your projects and accessible by class name.
	public static String Names(String a) {
		//char[] arr=a.toCharArray();
		String rev="";
		for(int i=a.length()-1; i>=0; i--) {
			rev+=a.charAt(i);
			
		}
		return rev;
		
	}
	//Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
	//Method should be available inside the class where it was declared and executed by calling it is name.
	
	private static String Vowels(String a ) {
		String newWord=a.replaceAll("[^aeiouyAEIOUY]","");
		System.out.println(newWord);
		return newWord;
	}
	
	
	public static void main(String[] args) {
		
		
		Task01 obj=new Task01();
		int[] b={1,2,3,4,5};
		System.out.println(obj.SumOfArr(b));
		Scanner u=new Scanner(System.in);
		System.out.println("enter name");
		String word=u.nextLine();
		
		System.out.println(Task01.Names(word));
		//System.out.println(Task01.Vowels("SHoklbek"));
		//System.out.println(Task01.Vowels("Virginia"));
		Vowels("virginia");
		
	
	}
	

}
