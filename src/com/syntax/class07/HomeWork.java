package com.syntax.class07;

public class HomeWork {

	public static void main(String[] args) {
		
		for(int i=100; i>1; i--) {
			System.out.print(i+" ");
		}
		System.out.println("----------------");
		//Print even numbers from 20 to 1 (2 ways)
		
		//1st way
		for(int x=20; x>1; x-=2) {
			System.out.print(x);
		}
		//2nd way
		int y=20;
		while(y>1) {
			System.out.print(y--);
			y--;
		}

	}

}
