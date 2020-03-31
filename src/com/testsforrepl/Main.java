package com.testsforrepl;

public class Main {
	static String surround(String s, String search_term)
	{
		String ret="";
		char a=search_term.charAt(0);
		for(int i=0; i<s.length(); i++) {
			if(a==s.charAt(i)) {
				ret+="("+a+")";				
			}else {
				ret+=s.charAt(i);
			}
		}
		return ret;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
	}

}
