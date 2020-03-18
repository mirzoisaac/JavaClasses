package com.testsforrepl;

import java.util.Scanner;

public class ReviewClassTask01 {

	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int i=u.nextInt();
		int[] nums= new int[i];
		for (int j=0; j<i; j++) {
			System.out.println("Give me a number to store in the array");
			nums[j]=u.nextInt();
	
		}
		
		

	}

}
