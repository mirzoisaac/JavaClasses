package com.syntax.class25;

public interface Shape {
	void calculateArea(int a);
	
	void calculatePerimeter(int a);
}
class Circle implements Shape{

	@Override
	public void calculateArea(int radius) {
		double area=3.14*(radius*radius);
		System.out.println(area);
	}

	@Override
	public void calculatePerimeter(int radius) {
		double perimeter=2*3.14*radius;
		System.out.println(perimeter);
	}

	
	
}
class Square implements Shape {

	@Override
	public void calculateArea(int a) {
		int area=a*a;
		System.out.println(area);
	}

	@Override
	public void calculatePerimeter(int a ) {
		int perimeter=4*a;
		System.out.println(perimeter);
		
	}

	
}

