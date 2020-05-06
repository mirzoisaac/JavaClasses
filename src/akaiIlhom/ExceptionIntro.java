package akaiIlhom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExceptionIntro {

	public static void main(String[] args) {

		try {
			int a = 15;
			int b = 0;

			System.out.println("first code " + a / b);
		} catch (ArithmeticException ae) {
			// ae.printStackTrace();
			// System.out.println(ae);
			System.out.println(ae.getMessage());
		}

		int c = 20;
		int d = 5;
		System.out.println("second code " + c / d);

		String filePath = System.getProperty("user.dir") + "/configs/Examples.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);
			fis.close();
			Properties prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println(e);
			// System.out.println(e.getMessage());
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
			// e.printStackTrace();
		}
		
		System.out.println("End of program");

	}

}
