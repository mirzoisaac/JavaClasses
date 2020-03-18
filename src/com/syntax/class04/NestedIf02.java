package com.syntax.class04;

public class NestedIf02 {

	public static void main(String[] args) {
		boolean allergy=true, appleAllergy=true, orangeAllergy=false, kiwiAllergy=true;
		
		if(allergy) {
			System.out.println("Please answer below");
			if(orangeAllergy) {
				System.out.println("Do not eat Oranges");
			}if(appleAllergy) {
				System.out.println("Do not eat Apples");
			}else if(kiwiAllergy) {
				System.out.println("Do not eat Kiwi");
				
			}
		}else {
			System.out.println("You are healthy");
		}
		boolean test=false;
	String result=(test==true)?"Yes":"No";
		System.out.println(result);
		
		

	}

}
