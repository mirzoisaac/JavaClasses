package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task02 {

	public static void main(String[] args) {
//		Create a map of Best Buy store. Place
//		item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//
//		Retrieve all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer, String> bestbuy=new LinkedHashMap<>();
		bestbuy.put(7664847, "Printer");
		bestbuy.put(7664848, "TV");
		bestbuy.put(7664849, "LapTop");
		bestbuy.put(7664850, "Phone");
		System.out.println(bestbuy);
		Set<Entry<Integer,String>>entry=bestbuy.entrySet();
		for(Entry<Integer, String> e:entry) {
		
			System.out.println(e.getKey()+" :"+e.getValue());
		}
		System.out.println("-------------Iterator----------------");
		Iterator<Entry<Integer, String>> it=entry.iterator();
		while(it.hasNext()) {
			Entry<Integer,String> a=it.next();
			System.out.println(a.getKey()+" ::"+a.getValue());
		}


	}

}
