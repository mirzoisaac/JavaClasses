package com.testsforrepl;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner x=new Scanner (System.in);
		System.out.println("Please enter");
		String sex=x.nextLine();
		if(sex.equals("F")){
		      System.out.println("Please enter your age");
		      int age=x.nextInt();
		      if(age>25){
		        System.out.println("Woman");
		      }else{
		        System.out.println("Girl");
		      }

	}
	}
}
