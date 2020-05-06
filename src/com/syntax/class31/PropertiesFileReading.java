package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		// to read the file:
		//1.have file
		String filePath="C:\\Users\\mirzo\\eclipse-workspace\\JavaBasics\\configs\\Examples.properties";
		
		//2. bring object of FileInputStream
		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		//to handle data from .properties file we need Property Class
		Properties prop=new Properties();
		prop.load(fileInput);
		String name=prop.getProperty("name");
		System.out.println(name);
		String city=prop.getProperty("city");
		System.out.println(city);
        Set<Object> keys=prop.keySet();
        for(Object k:keys) {
        	System.out.println(k);
        }
        Collection <Object> values= prop.values();
        for(Object v:values) {
        	System.out.println(v);
        }
        Set<Entry<Object,Object>> entry=prop.entrySet();
        for(Entry<Object,Object> e:entry) {
        	System.out.println(e);
        }

	}

}
