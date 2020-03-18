package com.syntax.class04;

public class Task02 {

	public static void main(String[] args) {
	double rate=5.5;
	int price=250000;
	
	if(rate<4.5) {
		System.out.println("I will not buy the house");
	}else {
		System.out.println("I will consider to buy a house");
		if(price<200000) {
			System.out.println("I pay cash");
			}else if(price>200000){
				System.out.println("I get a loan");
			}
	}

	}

}
