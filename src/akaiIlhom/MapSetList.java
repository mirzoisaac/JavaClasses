package akaiIlhom;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class MapSetList {

	public static void main(String[] args) {
		
		// Map (Map)
		Map<String, Integer> map= new LinkedHashMap<>();
		
		map.put("Oranges", 10);
		map.put("Apples", 10);
		map.put("Grapes", 10);
		map.put("Melon", 20);
		System.out.println(map);
		
		System.out.println("------LIST---------");
		
		//List (Collection)
		List<String> fruits= new ArrayList<>();
		fruits.add("Oranges");
		fruits.add("Apples");
		fruits.add("Grapes");
		fruits.add("Melon");
		fruits.add("Oranges");
		fruits.add("Apples");
		System.out.println(fruits);
		
		System.out.println("------SET---------");
		//Set (Collection)
		Set<String> set= new LinkedHashSet<>();
		set.add("Oranges");
		set.add("Apples");
		set.add("Grapes");
		set.add("Melon");
		set.add("Oranges");
		set.add("Apples");
		System.out.println(set);
		
		//if brackets are Square [] then they are COLLECTION
		//if brackets are Curly {} then they are MAP

	}

}
