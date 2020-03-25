package com.syntax.class17;

public class StaticKeywordTest {
	
	public static void main(String[] args) {
		StaticKeywords.brand="Android";
		StaticKeywords.touchScreen=true;
		StaticKeywords.displayGeneralInfo();
		
		//access instance members of another class
		
		StaticKeywords sk=new StaticKeywords();
		sk.color="red";
		sk.memory=128;
		sk.displaySpecifications();
		
		StaticKeywords sk1=new StaticKeywords();
		sk1.color="red";
		sk1.memory=128;
		sk.displaySpecifications();
		StaticKeywords.brand="Android2";
		StaticKeywords.displayGeneralInfo();
		
		StaticKeywords sk2=new StaticKeywords();
		sk2.color="red";
		sk2.memory=128;
		
	
	}
	
	

}
