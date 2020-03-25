package com.syntax.class15;

public class Tasks2 {
	//Create a method createEmail(). Based on provided users name, 
	//lastName and email type, your method should return complete email Address.
	//Example: johnsnow@gmail.com or johnsnow@yahoo.com*
	
	String createEmail(String name, String last) {
		String email="";
	    name=name.toLowerCase();
	    last=last.toLowerCase();
		email=email.concat(name).concat(last);
		
		return email;
	}
	public static void main(String[] args) {
		
		Tasks2 obj=new Tasks2();
		String em=obj.createEmail("John", "Snow");
		System.out.println(em+"@gmail.com");
		
		boolean flag=obj.isPrime(3);
		System.out.println("The given number is prime: "+flag);
	}
	
	//write a method to return whether given number is prime or not?
	
	boolean isPrime(int a) {
	 boolean prime=true;
		if (a>1) {
			for(int i=2; i<a;i++ ) {
				if(a%i==0) {
					prime=false;
					break;
				}
			}
		}else {
			prime=false;
		}
		
		
		return prime;
		
	}


}
