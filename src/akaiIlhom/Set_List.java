package akaiIlhom;

import java.util.*;

public class Set_List {

	public static void main(String[] args) {
		//
		List<String> fruits= new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Melon");
		fruits.add("Pear");
		fruits.add("Mango");
		fruits.add("Orange");
		System.out.println(fruits);
		System.out.println("Size of my list is "+fruits.size());
		System.out.println("Index 3 of list is "+fruits.get(3));
		
		for(int i=0; i<fruits.size(); i++) {
			System.out.print(fruits.get(i)+"$$");
		}
		System.out.println();
		
		
		Set<String> fset= new TreeSet<>(fruits);// No duplicate 
		System.out.println(fset);
		System.out.println("Size of my list is "+fset.size());
		//System.out.println("Index 3 of list is "+fset.get(3));
		
		//1st way for loop
		for(String set:fset) {
			if(set.equalsIgnoreCase("Mango")) {
				System.out.println(set);
			}
		}
		
		//2nd way Iterator
		
		Iterator<String> iterator= fset.iterator();
		while(iterator.hasNext()) {// .hasNext()-->if my iterator is EMPTY or NOT then breaks
			String fruit=iterator.next();
			if(fruit.toLowerCase().startsWith("m") && fruit.contains("e") && fruit.endsWith("n")) {
				System.out.println(fruit.toUpperCase());
			}
		}
		
		

	}

}
