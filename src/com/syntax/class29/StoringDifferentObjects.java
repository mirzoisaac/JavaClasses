package com.syntax.class29;

import java.util.Iterator;
import java.util.*;

public class StoringDifferentObjects {

	public static void main(String[] args) {
		
		Set<Insurance> hset=new HashSet<>();
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Progressive", "Dog"));
		hset.add(new Health("BCBS"));
		
		System.out.println(hset.size());
		
		Iterator<Insurance> it=hset.iterator();
		while(it.hasNext()) {
			//Insurance obj=new Car("Geico", "BMW")
			//we need to assign it to the variable because 
			Insurance obj=it.next();
			obj.getQuote();
			obj.cancelInsurance();
			obj.method();
			//obj.display--> wont be availabe to insurance type
			System.out.println("-----------------------------");
			
		}

	}
}


