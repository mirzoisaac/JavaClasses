package com.syntax.class23;

public class Computer {
	String pc;

	Computer(String pc) {
		this.pc = pc;
	}
	void comp() {
		System.out.println("I love "+pc);
	}

	void operation() {
		System.out.println(pc+ " works perfectly");
	}
}

class Apple extends Computer {
	Apple(String pc) {
		super(pc);
	}
	void operation() {
		System.out.println(pc+ " works perfectly");
	}
	void method1() {
		System.out.println("my computer is "+pc);
	}
}

class Lenovo extends Computer {
	Lenovo(String pc) {
		super(pc);
	}
	void operation() {
		System.out.println(pc+ " works perfectly");
	}
	void method2() {
		System.out.println("my computer is "+pc);
	}
}

class HP extends Computer {
	HP(String pc) {
		super(pc);
	}
	void operation() {
		System.out.println(pc+ " works perfectly");
	}
}

class Dell extends Computer {
	Dell(String pc) {
		super(pc);
	}
	void operation() {
		System.out.println(pc+ " works perfectly");
	}
}
