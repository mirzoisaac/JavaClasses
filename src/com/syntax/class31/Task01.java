package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Task01 {

	public static void main(String[] args) throws IOException {
		String fileLoc="C:\\Users\\mirzo\\eclipse-workspace\\JavaBasics\\configs\\Task01.properties";
		
		FileInputStream fis=new FileInputStream(fileLoc);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		Set<Entry<Object,Object>> entry=prop.entrySet();
		
		for(Entry<Object,Object> e:entry) {
			System.out.println(e);
		}
		
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		String url=prop.getProperty("url");
		System.out.println(url);
		
		prop.setProperty("age", "25");
		
		FileOutputStream fos= new FileOutputStream(fileLoc);
		prop.store(fos, "age added");
		
		

	}

}
