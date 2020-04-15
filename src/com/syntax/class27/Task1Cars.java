package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1Cars {

	public static void main(String[] args) {
//		Create an arraylist of cars and retrieve all the values using 3 different ways.
//
//		Create an arrayList of words. Remove every word that ends with “e”. Use iterator

		ArrayList<String> cars = new ArrayList();
		cars.add("BMW");
		cars.add("Benz");
		cars.add("Audi");
		cars.add("VolksWagen");

		// 1st way
		for (String car : cars) {
			System.out.print(car + " ");
		}
		System.out.println("-----------------");

		// 2nd way
		for (int i = 0; i < cars.size(); i++) {
			System.out.print(cars.get(i) + " ");
		}

		System.out.println("-----------------");

		// 3rd way
		Iterator<String> it = cars.iterator();

		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		ArrayList<String> words=new ArrayList();
		words.add("open");
		words.add("close");
		words.add("worlds");
		words.add("scope");
		words.add("earth");
		
		Iterator<String> iter=words.iterator();
		while(iter.hasNext()) {
			String str=iter.next();
			if(str.endsWith("e")) {
				iter.remove();
			}	
		}
		System.out.println(words);

	}

}
