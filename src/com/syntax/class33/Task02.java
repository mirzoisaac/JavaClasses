package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task02 {
	
	public static String str;
	
	public static List<Exception> m(){
		List<Exception> list=new ArrayList<>();
		
		String fPath = "";

		try {
			FileInputStream fis = new FileInputStream(fPath);

		} catch (FileNotFoundException fne) {
			
			list.add(fne);
		}
		int a=10;
		int b=0;
		
		try {
			
			System.out.println(a/b);
		
		}catch (ArithmeticException ae) {
			list.add(ae);
		}
		int[] array = { 12, 1, 13 };
		try {
			System.out.println(array[4]);
		}catch(RuntimeException ai) {
			list.add(ai);
		}
		try {
			System.out.println(str.length());
		}catch(Exception npe) {
			list.add(npe);
		}
	
	

		
		return list;
	}

	public static void main(String[] args) {
//		Create a static method that will return a List of Exceptions.
//		Inside your method create objects of 4 exception classes using
//		try and catch blocks and store them inside your list.
//		Call your method inside main and print name and details of all Exception objects.
		
		List<Exception> listm=m();
		System.out.println(m());
		System.out.println(listm.size());
		
		for(Exception l:listm) {
			System.out.println(l.getMessage());
			System.out.println(l);
		}
		
		
		
	}

}
