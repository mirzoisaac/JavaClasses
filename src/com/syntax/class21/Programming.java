package com.syntax.class21;

public class Programming {
	Programming(){
		System.out.println("I love programming language");
	}
	Programming(String str){
		System.out.println("I love "+str);
	}
	public static void main(String[] args) {
		new Programming();
		new Programming("java");
		
	}

}
