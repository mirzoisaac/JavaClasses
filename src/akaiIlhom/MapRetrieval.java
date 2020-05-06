package akaiIlhom;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapRetrieval {

	public static void main(String[] args) {
		
		Map<Integer, String> map= new TreeMap<>();
		
		map.put(1, "James");
		map.put(2, "John");
		map.put(3, "Saidnukriddin");
		map.put(4, "Shoklbek");
		System.out.println(map);
		//how to get KEYS
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		//how to get VALUES
		Collection<String> values=map.values();
		System.out.println(values);
		
		//1st For Loop
		for(Integer k:map.keySet()) {
			System.out.println(k+" "+map.get(k));
		}
		for(String value:map.values()) {
			System.out.print(value+" ");
		}
		
		System.out.println("------ITERATOR---------");
		
		//2nd way Iterator
		Iterator<Integer> it=map.keySet().iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			System.out.println(key+"::"+map.get(key));
		}
		
		Iterator<String> iter=map.values().iterator();
		while(iter.hasNext()) {
			String val=iter.next();
			System.out.println(val);
		}
		

	}

}
