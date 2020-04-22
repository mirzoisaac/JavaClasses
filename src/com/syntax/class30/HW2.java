package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HW2 {

	public static void main(String[] args) {
//		Create a Map from array of cities that will sort keys in alphabetical order. 
//		As a key store the name of the city and as a value store the length of the city 
//		(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
//		If any city name is more than 7 characters remove that city . 
		
		Map<String, Integer> cities=new TreeMap<>();
		String city="Dushanbe";
	    cities.put(city, city.length() );
	    String city1="Paris";
	    cities.put(city1, city1.length() );
	    String city2="Moscow";
	    cities.put(city2, city2.length() );
	    String city3="Washington DC";
	    cities.put(city3, city3.length() );
	    
	    System.out.println(cities);
	    System.out.println("-------------");
//	    for(Integer i:cities.values()) {
//	    	System.out.println(i);
//	    	if(i>7) {
//	    		cities.remove();
//	    	}
	    Iterator<Entry<String,Integer>> it=cities.entrySet().iterator();
	    while(it.hasNext()) {
	    	Entry<String,Integer> ob=it.next();
	    	if(ob.getValue()>7) {
	    		it.remove();
	    	}
	    	
	    	
	    	
	    	
	    }
	    	
	    
	    System.out.println(cities);
	    System.out.println("-------------");

	}

}
