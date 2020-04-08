package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		File obj=new JavaFile();
		obj.open();
		File obj1=new WordFile();
		obj1.open();
		File obj2=new PDFFile();
		obj2.open();
		obj.close();
		obj1.edit();

	}

}
