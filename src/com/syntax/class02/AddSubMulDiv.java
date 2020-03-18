package com.syntax.class02;

public class AddSubMulDiv {

	public static void main(String[] args) {
		// Add, sub, multiply and divide 2 decimal values. Your program should say: "The___ of 2 numbers __ and __ is equal to __"
		double a=2.5, b=5.2, x, y,z,s;
		x=a+b; 
		y=a-b;
		z=a*b;
		s=a/b;
		
		System.out.println("The addition of 2 numbers " +a+ " and " +b+" is equal to "+x);
		System.out.println("The subtraction of 2 numbers " +a+ " and " +b+" is equal to "+y);
		System.out.println("The multiplication of 2 numbers " +a+ " and " +b+" is equal to "+z);
		System.out.println("The division of 2 numbers " +a+ " and " +b+" is equal to "+s);
		
		// Write a program to find the square of the number 3.9
		double w=3.9, g;
	    g=w*w;
			
		System.out.println("The square of the " +w+ " is "+g);
		
		// The area and perimeter of a rectangle width=5, height=8;
		 
		byte j=5, h=8;
		int p, o;
		o=j*h;
		p=j*2+h*2;
		
		System.out.println("The perimeter of a rectangle with width "+j+" and height "+h+" is equal to "+p+ " and the area is "+o );
		

		
		
		

	}

}
