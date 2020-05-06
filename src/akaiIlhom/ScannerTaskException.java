package akaiIlhom;

import java.util.Scanner;

public class ScannerTaskException {

	public static void main(String[] args) {

//		How would handle InputMismatchException? 
//		Input Mismatch Exception when user enters mismatch value then programmer expected.

		Scanner scan = new Scanner(System.in);

		try {
			int i = scan.nextInt();
			System.out.println("My input is " + i);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			int y = scan.nextInt();
			System.out.println("My input is " + y);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Virginia");
		

	}

}
