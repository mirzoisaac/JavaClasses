package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class DrinksArrayList {
	// 3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace
			// it with water.


	public static void main(String[] args) {
		ArrayList<String> drinks=new ArrayList();
		drinks.add("Coke");
		drinks.add("Milk");
		drinks.add("Coffee");
		drinks.add("Smoothie");
		drinks.add("Juice");
		
		System.out.println(drinks);
		System.out.println("-----------------");
		
		for(int i=0; i<drinks.size(); i++) {
			if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "Water");
			}
		}
		System.out.println(drinks);
		System.out.println("-------------");
		
		Iterator<String> it=drinks.iterator();
		while(it.hasNext()) {
			String str=it.next();
			if(str.contains("a") || str.contains("e")) {
				//str=str.replace(str, "Water");
				//drinks.set(0, "water");
				
			}
			//System.out.print (str+"  ");
			
		}
		//System.out.println(drinks);
		

	}

}
