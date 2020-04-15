package com.syntax.class26;

public class Registration {
//	Create Registration Class in which you would have variables as email, 
//	userName and password that have an access scope only within its own class. 
//	After creating an object of the class user should be able to call methods 
//	and in each method separately pass values to set users email, username and password. 
//	Requirements: 
//
//	Valid email consider to be only yahoo
//	Valid userName and password cannot be empty and should be of length larger than 6 characters. 
//	Also valid password cannot contain userName.
	private String email, username, password;
	
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.contains("yahoo.com")) {
				this.email=email;
			}else {
				System.out.println("Email must be only yahoo.com");
			}
		}else {
			System.out.println("Email can not be left Empty");
		}
		
	}
	public void setUsername(String username) {
		if(!username.isEmpty()) {
			if(username.length()>6) {
				this.username=username;
			}else {
				System.out.println("Username is too short");
			}
		}else {
			System.out.println("Username cannot be empty");
		}
		
	}
	public void setPassword(String password) {
		if(!password.isEmpty()) {
			if(password.length()>6 ){
				
			if(!password.contains(username)) {
				this.password=password;
			}else {
				System.out.println("password can not contain username ");
			}
			}else {
				System.out.println("Password is short");
			}
		}else {
			System.out.println("Password cannot be empty");
		}
	}
	public String getEmail() {
		return email;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	

}
