package com.syntax.class14;

public class Phone {
	
	String brand;
	String os;
	int price;
	String batt;
	
	void fast (){
		System.out.println(brand+" works fast");
	}
	void charge() {
		System.out.println(brand+" battery lasts long/short ");
	}
	void screen() {
		System.out.println(brand+" shows graphics UHD");
	}
	
	public static void main(String[] args) {
		
		Phone iPhone=new Phone();
		iPhone.brand="iPhone";
		iPhone.os="iOS";
		iPhone.price=1200;
		iPhone.batt="Scion";
		
		iPhone.fast();
		iPhone.charge();
		iPhone.screen();
		
		Phone android=new Phone();
		android.brand="Samsung";
		android.price=1000;
		android.batt="Different";
		
		android.fast();
		android.charge();
		android.screen();
		
	
		
	}
	

}
