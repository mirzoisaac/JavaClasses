package com.testsforrepl;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		int[][] a1 = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
				int sum=0;
				int sum1=0;
				int sum2=0;
				int sum3=0;
				for(int i=0; i<a1.length;i++) {
					for(int j=0; j<a1[i].length; j++) {
						
							if(i==0){
							sum+=a1[i][j];
							}else if(i==1){
							  sum1+=a1[i][j];
							}else if(i==2){
							  sum2+=a1[i][j];
							}else if(i==3){
							  sum3+=a1[i][j];
							}
							
					}
				}
				System.out.println(sum);
				System.out.println(sum1);
				System.out.println(sum2);
				System.out.println(sum3);
			
			
			 
			
			
		

		    
	}

}
