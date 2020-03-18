package com.syntax.class10;

public class TaskLargestnumber {

	public static void main(String[] args) {
		//find the largest number from an array
		
		int[] nums= {200, 30, -1, 900, 56, 787};
		
		int l=0;
		
		for( int i:nums) {
			if(i>l) {
				l=i;
			}
			
		}

		System.out.println("Largest number is "+l);
	}

}
