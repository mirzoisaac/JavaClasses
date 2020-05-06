package com.syntax.class30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW3 {

	public static void main(String[] args) {
////		Create a Map that will store Employee name and salary. 
//		Write a logic to retrieve an employee who gets the highest salary. 
//		Output should be in the below format
////		John Smith=$100000
		
		Map<String, Integer> employee=new TreeMap<>();
		employee.put("John", 95000);
		employee.put("Jack", 90000);
		employee.put("Jane", 80000);
		employee.put("Mike", 1000000);
		employee.put("Jason",970000);
		
		Integer max=Collections.max(employee.values());
		System.out.println(max);
		
		//Set<Entry<String, Integer>> entSet=employee.entrySet();
		
		Iterator<Entry<String, Integer>> ent= employee.entrySet().iterator();
		while(ent.hasNext()) {
			Entry<String, Integer> e=ent.next();
			if(e.getValue()==max) {
				max=e.getValue();
				System.out.println(e.getKey()+"=$"+max);
			}
		}
		
		Set<String> words=new LinkedHashSet<>();
		words.add("I");
		words.add("love");
		words.add("Java");
		words.add("very much");
		
		System.out.println(words);
		
		for(String w:words) {
			System.out.print(w+" ");
		}
		System.out.println();
		Iterator<String> it= words.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		List<Integer> nums= new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		int sum = 0;
		
		for(Integer n:nums) {
			sum+=n;
		}
		System.out.println(sum);
		Iterator<Integer> iter= nums.iterator();
		while(it.hasNext()) {
			sum+=iter.next();
			
		}
		System.out.println(sum);
		

	}

}
