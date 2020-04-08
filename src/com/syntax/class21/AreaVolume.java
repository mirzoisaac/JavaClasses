package com.syntax.class21;

public class AreaVolume {
	int area;

	void method(int a) {
		area=a*a;
		System.out.println(area);
	}

	void method(int a, int b) {
		area=a*b;
		System.out.println(area);
	}

	void method(int a, int b, int c) {
		area=a*b*c;
		System.out.println(area);
	}
	public static void main(String[] args) {
		AreaVolume obj=new AreaVolume();
		obj.method(5);
		obj.method(5,8);
		obj.method(2,4,6);
		
	}
}
