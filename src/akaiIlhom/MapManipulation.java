package akaiIlhom;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapManipulation {

	public static void main(String[] args) {
		
		//HashMap
		//KEY and VALUE makes one ENTRY
		//KEY must be Unique!
		//VAlUE can be the same data/object several times
		
		Map <String, String> map= new HashMap<>();
		map.put("Name","Ilhom");
		map.put("LastName", "Ishankulov");
		map.put("Age", "30");
		map.put("Address", "Virginia");
//		map.put("Name", "Mirzo");
//		map.put("Age", "29");
		
		System.out.println(map);
		// get a Value of a KEY
		String name=map.get("Name");
		System.out.println(name);
		
		//to Remove an Entry just REMOVE(KEY);
		map.remove("Age");
		System.out.println(map);
		
		//check existence of a KEY
		boolean cont=map.containsKey("Name");
		System.out.println(cont);
		
		//get the size/length of a MAP
		int size=map.size();
		System.out.println(size);
		
		Collection<String> values=map.values();
		System.out.println(map.values());
		
		

	}

}
