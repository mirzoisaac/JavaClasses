package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Person {
//	Create a Person class with following private fields: name, lastName, age, salary. 
//
//	Variables should be initialized through constructor.
//	Inside the class also create a method to print user details.
//	In Test Class create a Map that will store key in ascending order. 
//	In that map store personId and a Person Object. Print each object details.
//	
	private String name, lastName;
	int age;
	private double salary;

	public void method() {
		System.out.println(
				"First name " + name + " last name is " + lastName + " age is " + age + " salary is " + salary);
	}

	public Person(String name, String lastName, int age, double salary) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Map<Integer, Person> person = new TreeMap<>();
		person.put(17362678, new Person("SHokl", "Mulla", 30, 50000.0));
		person.put(94843739, new Person("KOm", "Mulla", 30, 50000.0));
		person.put(28373794, new Person("raja", "Mulla", 30, 50000.0));
		person.put(38374739, new Person("simbo", "Mulla", 30, 50000.0));

		System.out.println("-------Keys----------");

		Set<Integer> key = person.keySet();
		for (Integer keys : key) {
			Person obj = person.get(keys);
			obj.method();
		}
		System.out.println("-------Value----------");
		Collection<Person> col = person.values();
		for (Person c : col) {
			c.method();
		}
		System.out.println("--------Entry----------");
		Set<Entry<Integer, Person>> entry = person.entrySet();
		for (Entry<Integer, Person> e : entry) {
			Person ob = e.getValue();
			ob.method();
		}
		System.out.println("--------Iterator Entry----------");

		Iterator<Entry<Integer, Person>> it = person.entrySet().iterator();
		while (it.hasNext()) {
			it.next().getValue().method();

			System.out.println("-------Iterator Value----------");
			Iterator<Person> iter = person.values().iterator();
			while (iter.hasNext()) {
				iter.next().method();
			}
			System.out.println("-----ITerator key----------");
			
			Iterator<Integer> i=person.keySet().iterator();
			while(i.hasNext()) {
				person.get(i.next()).method();
			}

		}
	}

}
