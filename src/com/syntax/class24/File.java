package com.syntax.class24;

public abstract class File {
	abstract void open();
	
	void edit() {
		System.out.println("Edit");
	}
	void close() {
		System.out.println("Close");
	}
}
class JavaFile extends File{

	@Override
	void open() {
		System.out.println("to open .java file we need notepad++");
		
	}
}
class WordFile extends File{

	@Override
	void open() {
		System.out.println("to open .doc file we need Microsoft word to be installed");
		
	}
	
}
class PDFFile extends File{

	@Override
	void open() {
		System.out.println("to open .pdf file we need Adobe to be installed");
		
	}
	
}