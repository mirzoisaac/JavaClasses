package akaiIlhom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntries {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("Daler", 1990);
		map.put("Shanoza", 1995);
		map.put("Rustam", 2000);
		map.put("Lola", 2005);
		System.out.println(map);

		Map<String, Integer> map1 = new LinkedHashMap<>(map);

		map1.put("Ilhom", 1990);
		map1.put("Shahlo", 1995);
		map1.put("Emom", 2000);
		map1.put("Farida", 2005);
		System.out.println(map1);

		Map<Integer, String> map2 = new LinkedHashMap<>();
		map2.put(1990, "Daler");
		map2.put(1995, "Shahnoza");
		map2.put(2000, "Rustam");
		map2.put(2005, "Lola");

		System.out.println(map2);

		System.out.println("------LIST----------");

		List<Map> mapList = new ArrayList<>();
		mapList.add(map);
		mapList.add(map2);
		System.out.println(mapList);

		Set<Entry<String, Integer>> entry = map.entrySet();
		
		System.out.println("---- Entry For Each Loop-----");
		//1st way for loop
		
		for(Entry<String, Integer> e:entry) {
			//System.out.println(e);
			String names=e.getKey();
			//System.out.println(names);
			int years=e.getValue();
			System.out.println(names+"-->"+years);
		}
		
		System.out.println("---- Entry Iterator-----");
		//2nd way Iterator
		
		Iterator<Entry<String, Integer>> iter=map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> ent=iter.next();
			String name=ent.getKey();
			Integer year=ent.getValue();
			System.out.println(name+"::"+year);
		}
		


	}

}
