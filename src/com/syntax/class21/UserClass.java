package com.syntax.class21;

public class UserClass {
//	write program: userClass  that has a constructor that initializes instance variable name and mobile number. 
//	Create a subclass  userInfo that will have user address variable
//	and it also being initialized through constructor call.
//	Print users name, mobile number and address in userDetails method. Test your code.
	String name;
	long mobileno;
	
	UserClass(String name, long mobileno){
		this.name=name;
		this.mobileno=mobileno;
	}

}
class UserInfo extends UserClass{
	String address;
	
	UserInfo(String name, long mobileno, String address){
		super(name,mobileno);
		this.address=address;
		
	}
	void userDetails() {
		System.out.println(name+" "+mobileno+" address is "+address);
	}
}


