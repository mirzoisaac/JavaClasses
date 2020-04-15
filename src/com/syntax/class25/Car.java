package com.syntax.class25;

public abstract class Car {
	String color;
	double carPrice;
	abstract double calculateSalePrice();
	Car(double carPrice, String color){
		this.carPrice=carPrice;
		this.color=color;
	}

}
class Sedan extends Car{
	Sedan(double carPrice, String color, int length){
		super(carPrice, color);
		this.length=length;
	}
	
	int length=19;
	@Override
	double calculateSalePrice() {
		
		if (length>20) {
			carPrice-=(carPrice*0.05);
		}else {
			carPrice-=(carPrice*0.1);
		}
		
		return carPrice;
	}
	
	
}
class Truck extends Car{
	Truck(double carPrice, String color, int weight){
		super(carPrice, color);
		this.weight=weight;
	}
	int weight;
	

	@Override
	double calculateSalePrice() {
		
		if (weight>2000) {
			carPrice-=(carPrice*0.1);
		}else {
			carPrice-=(carPrice*0.2);
		}
		
		return carPrice;
	}
}