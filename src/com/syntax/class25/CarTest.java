package com.syntax.class25;

public class CarTest {

	public static void main(String[] args) {
		Car sedan=new Sedan(12000,"White",19);
		double sedanprice=sedan.calculateSalePrice();
		System.out.println(sedanprice);
		Car truck=new Truck(15000, "Black",1900);
		double truckprice=truck.calculateSalePrice();
		System.out.println(truckprice);
		

	}

}
