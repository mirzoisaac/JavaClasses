package com.testsforrepl;

import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner u=new Scanner(System.in);
    System.out.println("Please enter your gender: M or F");
    String a=u.nextLine();
    if(a.equals("F")){
      System.out.println("Please enter your age");
      int age=u.nextInt();
      if(age>25){
        System.out.println("Woman");
      }else{
        System.out.println("Girl");
      }
    }else if(a.equals("M")){
       System.out.println("Please enter your age");
      int age=u.nextInt();
      if(age>25){
        System.out.println("Man");
      }else{
        System.out.println("Boy");
      }
    }
  }
}
