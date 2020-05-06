package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
        //write into existing file and add values
		String filePath="C:\\Users\\mirzo\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fileInput);
		
		prop.setProperty("phoneNumber", "123456678");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "added additional key");
		



	}

}
