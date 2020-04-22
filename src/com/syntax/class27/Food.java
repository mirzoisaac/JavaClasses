package com.syntax.class27;


//2. hw create food class that will have 3 undefined methods and it will have 4
		// subclasses;
		// create a collection of food and using 3 ways execute methods
public abstract class Food {
	
	String food;
	public Food(String food) {
		this.food=food;
	}
	
	public abstract void cal();
	public abstract void pro();
	public abstract void car();

}
class Oatmeal extends Food{
	
	Oatmeal(String food){
		super(food);
	}

	@Override
	public void cal() {
		System.out.println(food+" has less calories");
		
	}

	@Override
	public void pro() {
		System.out.println(food+" has medium protein");
		
	}

	@Override
	public void car() {
		System.out.println(food+" has little carbohydrates");
		
	}
	
}
class Chicken extends Food{

	public Chicken(String food) {
		super(food);
		
	}

	@Override
	public void cal() {
		System.out.println(food+" has less calories");
	}

	@Override
	public void pro() {
		System.out.println(food+" has less proteins");
		
	}

	@Override
	public void car() {
		System.out.println(food+" has less carbohydrates");
		
	}
	
}
class Yogurt extends Food{

	public Yogurt(String food) {
		super(food);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cal() {
		System.out.println(food+" has less calories 3");
		
	}

	@Override
	public void pro() {
		System.out.println(food+" has more proteins 3");
		
	}

	@Override
	public void car() {
		System.out.println(food+" has less carbohydrates 3");
		
	}
	
}
