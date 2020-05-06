package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
//		How would handle InputMismatchException? 
//		Input Mismatch Exception when user enters mismatch value then programmer expected.
		
		Scanner scan=new Scanner(System.in);
		
		try{
			int i=scan.nextInt();
		}catch(InputMismatchException ime) {
			System.out.println(ime);
			//System.out.println(ime.getMessage());
		}
        
		
		
		


	}

}
