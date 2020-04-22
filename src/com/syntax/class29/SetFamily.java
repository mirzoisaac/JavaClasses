package com.syntax.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		Set<String> veggies= new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		//HashSet will not make correct order insertion of elements
		System.out.println(veggies);
		System.out.println("-----------------LinkedHashSet--------------");
		//LinkedHashSet will make correct order insertion of elements
		//Set<String> veggies= new Linked HashSet<>();
		Set<String> fruits=new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("banana");
		fruits.add("tomato");
		fruits.add("pear");
		fruits.add("mango");
		
		System.out.println(fruits);
		System.out.println("-----------------TreeSet--------------");
		//TreeSet  will make ALphabetical/ascending order insertion of elements
		//Set<String> veggies= new Linked TreeSet<>();
		
		Set<Object> food=new TreeSet<>(veggies);
		//adding duplicate objects from veggies collection
		food.addAll(veggies);
		food.addAll(fruits);
	    System.out.println(food);

	}

}
