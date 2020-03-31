package com.syntax.class18;

public class Shokl {
	private Shokl() {
		System.out.println("Private");
	}
	protected Shokl(int a) {
		System.out.println("protected");
	}
	public Shokl(String str) {
		System.out.println("public");
	}
	
	//static Shokl(char a) {} CE: constructor can not be static!
		
	

}
