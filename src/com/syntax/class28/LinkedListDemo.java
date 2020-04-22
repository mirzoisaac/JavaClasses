package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;




public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList();
		llist.add("Yunus");
		llist.add(0,"Reyhan");
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");
		
		//1st way
		for(String ll:llist) {
			System.out.print(ll+" ");
		}
		System.out.println();
		
		//2nd way
		for(int i=0; i<llist.size(); i++) {
			System.out.print(llist.get(i)+" ");
		}
		System.out.println();
		
		//3rd way
		Iterator<String> it=llist.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		//can we store objects of user defined classes?
		
		LinkedList<Food1> food=new LinkedList();
		food.add(new Oatmeal("Oatmeal"));
		food.add(new Chicken("Chicken"));
		
		
	}

}
