package com.syntax.class09;

public class TaskHours {

	public static void main(String[] args) {
		for (int i = 0; i <= 23; i++) {
			for (int j = 0; j <= 59; j++) {
				if (j <= 9) {
					System.out.println(i + ":0" + j);
				} else {
					System.out.println(i + ":" + j);
				

				}

			}
		}

	}

}
