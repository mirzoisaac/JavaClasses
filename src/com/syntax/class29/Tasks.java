package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tasks {

	public static void main(String[] args) {
		//Task 1
//		Create a Set collection in which you need to add names of the countries. 
//		In this set we want all objects to be sorted in alphabetical order. 
//		Using 2 different ways retrieve all elements from set.
		Set<String> countries=new TreeSet<>();
		countries.add("Tajikistan");
		countries.add("USA");
		countries.add("Turkey");
		countries.add("Germany");
		countries.add("Canada");
		countries.add("Norway");
		countries.add("Austria");
		countries.add("Italy");
		countries.add("Spain");
		
		for(String c:countries) {
			System.out.print(c+" ");
		}
	
		System.out.println();
		
		Iterator<String> it=countries.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//Task 2
//		Create a Set of cities in which you want to make sure that insertion order is maintained.
//		Using Iterator remove any city that starts with “A”;
		
		Set<String> cities= new LinkedHashSet<>();
		cities.add("Qurghonteppa");
		cities.add("Dushanbe");
		cities.add("Woodbridge");
		cities.add("Amsterdam");
		cities.add("Barcelona");
		cities.add("Roma");
		cities.add("Astrakhan");
		Iterator<String> iter=cities.iterator();
		while(iter.hasNext()) {
			String a=iter.next();
			if(a.startsWith("A")) {
				iter.remove();
			}
		}
		System.out.println(cities);
		
		//Task 3
//		Create a Set collection that will hold Objects of Student Type. 
//		In this set we do not care about the insertion order. 
//		Each student object should have name and studentID. Display name of each student.
		
		Set<Student> student=new HashSet<>();
		student.add(new StudentA("Shokl", "123456789"));
		student.add(new StudentB("Simbo", "123451234"));
		student.add(new StudentC("Maymun", "123123123"));
		
		Iterator<Student> iterator=student.iterator();
		while(iterator.hasNext()) {
			Student a=iterator.next();
			a.display();
			iterator.next().display();
		}
	

	}

}
