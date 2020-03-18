package com.syntax.class11;

import java.util.Scanner;

public class Task03username {

	public static void main(String[] args) {
//		Accept username, password and confirm password from a user and check following
//		requirements:
//
//		Username and Password cannot be  empty, 
//		if so→ message=“Username and Password cannot be empty”.
//		Password should be minimum 8 characters, if less → message=“Password is too short”.
//		Password cannot contain username if so, → message=“Password cannot contain username”.
//		Password should match confirmed password, if not  → message=“Passwords do not match”.

		Scanner u = new Scanner(System.in);
		System.out.println("Enter username");
		String uname = u.nextLine();
		System.out.println("Enter Password");
		String pword = u.nextLine();

		if (!(uname.isEmpty() || pword.isEmpty())) {
			

			if (pword.length() > 7) {
				
				if (!pword.contains(uname)) {
					System.out.println("Confirm your password");
					String con1 = u.nextLine();
					if (pword.equals(con1)) {
						System.out.println("Account created");
					} else {
						System.out.println("Password doesnt match");
					}

				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password is too short");

			}

		} else {
			System.out.println("Username and password can not be empty");
		}

	}

}
