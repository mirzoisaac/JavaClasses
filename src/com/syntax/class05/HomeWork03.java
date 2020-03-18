package com.syntax.class05;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		double n1, n2 = 0, n3 = 0, l = 0;
		System.out.println("Please enter three numbers");
		n1=u.nextDouble();
		n2=u.nextDouble();
		n3=u.nextDouble();
		
	
		
		
		if(n1>n2) {
			if(n1>n3) {
				l=n1;
			}else {
				l=n3;
			}
		}else {
			if (n2>n3)
			l=n2;
			else {
			l=n3;
			}
		
		}
		System.out.println("Largest number is "+l);
		
		System.out.println("----------------------------");
		
		if(n1>n2 && n1>n3) {
			l=n1;
		}else if(n3>n2 && n3>n1) {
			l=n3;
		}else {
			l=n2;
		}
		System.out.println("Largest number is "+l);
		
		

	}

}
