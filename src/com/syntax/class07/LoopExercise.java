package com.syntax.class07;

public class LoopExercise {

	public static void main(String[] args) {
		int x=50;
		
		while(x>=1) {
			System.out.println(x+" ");
			x--;
		}
		
	System.out.println("------------task 02-------------");
		//1st way
		
		int y=1;
		
		 while(y<=20) {
			 if(y%2!=0) {
			 System.out.print(y+" ");
			 }
			 y++;
		 }
		 // 2nd way
		 
		 int c=1;
			
		 while(c<=20) {
			 System.out.print(c++);
			 c++;
		 }
		 //3rd way
		 int b=1;
			
		 while(b<=20) {
			 System.out.print(b);
			 c+=2;
		 }
	}
}
