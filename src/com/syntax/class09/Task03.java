package com.syntax.class09;

public class Task03 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("---------------");

		for (int x=1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*"+" ");
			
			}
			System.out.println();
			
		}
		for (int q=5; q>=1; q--) {
			for(int w=1; w<=q; w++) {
				System.out.print("*"+" ");
			
			}
			System.out.println();
		}	
		
	}

}
