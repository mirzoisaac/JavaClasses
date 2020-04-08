package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		Computer[] computer= {new Apple("Apple"),new Lenovo("Lenovo"), new Dell("Dell"), new HP("HP")};
		
		for( Computer c:computer) {
			c.operation();
			c.comp();
			System.out.println("------------");
		}
		System.out.println("-------------------");
		
		for(int i=0; i<computer.length; i++) {
			computer[i].comp();
			computer[i].operation();
		}
	}

}
