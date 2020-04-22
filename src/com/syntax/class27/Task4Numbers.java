package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4Numbers {

	// 4. Create an arrayList of even numbers from 1 to 50. Using Iterator remove
	// any number that is divisible by 5 from that arrayList.

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList();
		for (int i = 0; i < 51; i++) {
			if (i % 2 == 0) {
				nums.add(i);
			}
		}
		System.out.print(nums);
		System.out.println("-------------");

		Iterator<Integer> it = nums.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if (i % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(nums);

	}

}
