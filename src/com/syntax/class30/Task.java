package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task {
//	Create a map of countries with its capital that will store countries in alphabetical order.
//	Print all keys and values from a country map using for each loop and iterator.
//	Print all values from a country map using for each loop and iterator.


	public static void main(String[] args) {
		Map<String,String> countries=new TreeMap<>();
		countries.put("USA", "Washington DC");
		countries.put("Tajikistan", "Dushanbe");
		countries.put("Argentina", "Buenos Aires");
		countries.put("Netherlands", "Amsterdam");
		countries.put("UK", "London");
		countries.put("North Korea", "PyongYang");
	
		System.out.println(countries);
		
		//for each loop
		for(String c:countries.keySet()) {
			System.out.print(c+" ");
		}
		System.out.println();
		//iterator
		
		Iterator<String> it=countries.keySet().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//for each loop value
		for(String v:countries.values()) {
			System.out.print(v+" ");
		}
		System.out.println();
		//iterator value
		Iterator<String> iter=countries.values().iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
			
		
		
		
	}

}
