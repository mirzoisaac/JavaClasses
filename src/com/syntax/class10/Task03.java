package com.syntax.class10;

public class Task03 {

	public static void main(String[] args) {
//		Create an array of countries. 
//		While retrieving all values from an array print capital for each country.
//		(use 2 different loops).
		
		String[] countries= {"USA", "Canada", "Tajikistan", "Mexico"};
		
		for (String i:countries) {
			
			System.out.println(i);
			if (i.equals("USA")) {
				System.out.println("Washington");
			}else if (i.equals("Canada")) {
				System.out.println("Ottawa");
			}else if (i.equals("Tajikistan")) {
				System.out.println("Dushanbe");
			}else if (i.equals("Mexico")) {
				System.out.println("Mexico city");
			}
		}
			
			System.out.println("_------------------------");
//			2nd way
			String cap=null;
			for (int x=0; x<countries.length; x++) {
				
//				System.out.println(countries[x]);
				if (countries[x].equals("USA")) {
					cap="Washington";
				}else if (countries[x].equals("Canada")) {
					cap="Ottawa";
				}else if (countries[x].equals("Tajikistan")) {
					cap="Dushanbe";
				}else if (countries[x].equals("Mexico")) {
					cap="Mexico city";
				}
				System.out.println("The capital city of "+countries[x]+" is "+cap);
			}
		

	}

}
