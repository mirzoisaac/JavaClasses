package akaiIlhom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetCollections {

	public static void main(String[] args) {
		// Set is a collection which CAN NOT duplicate the elements
		//HashSet, LinkedHashSet, TreeSet;
		
		List<String> list= new ArrayList<>();
		list.add("Maryland");
		list.add("Virginia");
		list.add("DC");
		list.add("West Virginia");
		list.add("North Carolina");
		list.add("Maryland");
		list.add("Virginia");
		
		System.out.println(list);
		System.out.println("-----------SET ----------");
		
		//HashSet 
		Set<String> set= new HashSet<>();
		set.add("Maryland");
		set.add("Virginia");
		set.add("DC");
		set.add("West Virginia");
		set.add("North Carolina");
		set.add("Maryland");
		set.add("Virginia");
		System.out.println(set);
		
		
		//LinkedHashSet
		System.out.println("---------LinkedHashSet--------");
		
	     Set<String> set2=new LinkedHashSet<>();
	     set2.add("DC");
	     set2.add("Maryland");
	     set2.add("Virginia");
	     set2.add("North Carolina");
	     set2.add("West Virginia");
	     
		System.out.println(set2);
		
		// TreeSet
		System.out.println("---------TreeSet--------");
		
		Set<String> treeSet=new TreeSet<>(set2);// alphabetic
		System.out.println(treeSet);
		treeSet.addAll(set2);
		System.out.println("-----States-----");
		Set<String> states= new HashSet<>();
		states.add("California");
		states.add("NY");
		states.add("Colorado");
		states.add("Arizona");
		states.addAll(treeSet);
		System.out.println(states);
		
		
		Set<Integer> nums= new TreeSet<>();
		nums.add(1995);
		nums.add(1920);
		nums.add(2004);
		nums.add(2020);
		
		System.out.println(nums);
		//nums.clear();--> deletes datas from the TreeSet collections
		if(nums.contains(1920)) {
			System.out.println("It contains the object");
		}else {
			System.out.println("It does not contain the object");
		}
		nums.remove(1995);
		System.out.println(nums);
		int size=nums.size();
		System.out.println(size);
		
		System.out.println("nums set collection is Empty "+nums.isEmpty());
		nums.clear();
		System.out.println("nums set collection is Empty "+nums.isEmpty());

	}

}
