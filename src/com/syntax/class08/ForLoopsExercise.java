package com.syntax.class08;

public class ForLoopsExercise {

	public static void main(String[] args) {
		int y = 0;
		int x=0;
		
		for( int i=1; i<=99; i++) {
			if(i%2==0) {
				y=y+i;
			}else if (i%2!=0){
				x=x+i;
			}
		}System.out.println(y);
		System.out.println(x);
	}

}
