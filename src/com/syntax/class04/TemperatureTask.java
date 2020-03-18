package com.syntax.class04;

import java.util.Scanner;

public class TemperatureTask {

	public static void main(String[] args) {
		Scanner lenovo=new Scanner(System.in);
		System.out.println("Enter your city please");
		String city=lenovo.nextLine();
		System.out.println("Enter the temperature in F");
		int temp=lenovo.nextInt();
		temp=(temp-32)*5/9;
		System.out.println("Temperature in the city "+city+" is "+temp);
		
	

	}

}
