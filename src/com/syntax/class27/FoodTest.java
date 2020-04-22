package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		ArrayList<Food> food= new ArrayList();
		food.add(new Oatmeal("Oatmeal"));
		food.add(new Yogurt("Yogurt"));
		food.add(new Chicken("Chicken"));
		//1
		for(Food f:food) {
			f.cal();
			f.car();
			f.pro();
		}
		System.out.println("------------------------");
		//2
		for(int i=0; i<food.size(); i++) {
			food.get(i).cal();
			food.get(i).car();
			food.get(i).pro();
		}
		System.out.println("---------3rd way--------------");
		//3
		Iterator<Food> food1=food.iterator();
		while(food1.hasNext()) {
			food1.next().cal();
			food1.next().car();
			food1.next().pro();
		}
		

	}

}
