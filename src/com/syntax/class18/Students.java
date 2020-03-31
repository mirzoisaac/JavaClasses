package com.syntax.class18;

public class Students {
	//Write a java program of Class Students that takes students name and 3 subject grades.
	//Inside your class also have a method to Calculate Average Grade. 
	//Test Student class for 5 different students with different marks. 
	//Your program should print an average mark of each students name.
	//NOTE: please use different names for instance and local variables.
	
	String sname;
	int mathG, bioG, geoG;
	
	char calAve() {
		char mark;
		int ave=(mathG+bioG+geoG)/3;
		if (ave>=85) {
			mark='A';
		}else if(85>ave && ave>=75) {
			mark='B';
		}else if(75>ave && ave>=65) {
			mark='C';
		}else {
			mark='D';
		}
		
		return mark;		
	}
	
	void aveMark(char c) {
		System.out.println(sname+" average mark is "+c);
	}
	
	Students(String name, int mat, int bi, int ge){
		sname=name;
		mathG=mat;
		bioG=bi;
		geoG=ge;
	}
	
	public static void main(String[] args) {
		Students st1=new Students("Shokl",85,75,90);
		char aMark=st1.calAve();
		st1.aveMark(aMark);
		Students st2=new Students("Ahmed",85,75,90);
		char aMark2=st2.calAve();
		st2.aveMark(aMark2);
		Students st3=new Students("Ayse",10,10,10);
		char aMark3=st3.calAve();
		st3.aveMark(aMark3);
		
	}
	

}
