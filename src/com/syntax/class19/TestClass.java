package com.syntax.class19;

public class TestClass {

	public static void main(String[] args) {
		Dog dog=new Dog();
		// access variables from own class
		dog.breed="Husky";
		//access variables from parent class
		dog.color="grey";
		dog.fur="Too much";
		dog.size="Big";
		
		// access  method from own class
		dog.bark();
		//access methods from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		
		Animals animal=new Animals();
		//can access only features define within it 
		animal.color="WHite";
		animal.fur="Less";
		
	    two obj=new two();
		obj.print_geek1();
		obj.print_for();
		

	}

}
