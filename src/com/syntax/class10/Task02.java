package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
//		Create an array on integers and calculate the sum of all integer elements in an array.
		
		int[] x= {1,2,3,4,5,6};
		int sum=0;
		for(int i: x) {
		   		
			sum=sum+i;
		}
		System.out.println(sum);
		
		
	
	}

}
