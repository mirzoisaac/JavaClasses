package akaiIlhom;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		//ArrayList is Dynamic
		
		List<Integer> array= new ArrayList<>();
		//<String>
		//<Double>
		//List<Map<String,Integer>> list= new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		System.out.println(array);
		array.add(2, 10);
		System.out.println(array);
		
		int size=array.size();
		System.out.println("Size of my List is "+size);
		System.out.println(array.isEmpty());
		System.out.println(array.contains(6));
		array.remove(2);
		System.out.println(array);
		array.remove(4);
		System.out.println(array);
		array.set(1, 5);
		System.out.println(array);
		System.out.println(array.get(3));
		//array.clear();
		System.out.println("-------");
		System.out.println(array.isEmpty()); 
		
		//1st way with For Each Loop
		for(int i: array) {// for each loop to retrieve each elements individually
			System.out.print(i);
		}
		System.out.println();
		System.out.println("Iterator");
		//2nd way  with iterator
		
		Iterator<Integer> it= array.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		//3rd way with For LOOP
		System.out.println("Regular Loop");
		
		for (int i=0; i<array.size(); i++) {
			System.out.print(array.get(i)+" ");
		}
		

		
		

	}

}
