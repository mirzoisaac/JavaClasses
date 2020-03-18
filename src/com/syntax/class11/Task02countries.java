package com.syntax.class11;

public class Task02countries {

	public static void main(String[] args) {
//		Create an array of countries: north america countries, south america countries, 
//		europe countries, asian countries, african countries. 
//		Then print all values from that array using 2 different 
//		loops and calculate how many total countries been stored.

		String[][] states = { { "USA", "Canada", "Mexico" }, { "Chile", "Argetina", "Brazil", "Colombia" },
				{ "Germany", "France", "England" }, { "Tajikistan", "Japan", "Korea" },
				{ "Angola", "Nigeria", "Morocco" } };
		int count=0;

		for (String[] a : states) {
			for (String c : a) {
				System.out.print(c + " ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println("Total="+count);
		
		 int total=0;
	        for (int x = 0; x < states.length; x++) {
	            for (int y = 0; y < states[x].length; y++) {
	                System.out.print(states[x][y] + " ");
	                total++;
	            }
	            System.out.println();

	        }
	        System.out.println(total);

	}

}
