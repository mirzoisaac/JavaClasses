package com.syntax.class11;

public class Task01Cars {

	public static void main(String[] args) {
//		Create an array of cars : american, german, korean, italian.
//		Then retrieve all values from that array using 2 different loops
		
		String[][] cars= {{"Dodge","Ford","Cadillac","Chevrolet"},{"BMW","Audi","Benz","Porsche","Opel"},
				{"Kia","Hyundai","Daewoo"},{"Fiat","Alpha Romeo","Mazeratti"}};
				
		for(String[] c:cars) {
			for(String b:c) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}

}
