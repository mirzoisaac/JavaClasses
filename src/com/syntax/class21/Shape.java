package com.syntax.class21;

public class Shape {
	int radius;
	Shape(int radius){
		this.radius=radius;
	}
}
class Circle  extends Shape{
	double area;
	Circle(int radius){
		super(radius);
	}
	
	void calculate() {
	  area=3.14*(radius*radius);
	  System.out.println(area);
	}
}
