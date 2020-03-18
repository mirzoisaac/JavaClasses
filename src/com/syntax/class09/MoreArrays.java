package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron"; --> while running the java machine gives exception errors
		
		//System.out.println(students[3]);
		
		//if we store less elements than we declared
		// compiler will add default values
		String[] inClassStudents= new String[5];
		inClassStudents[0]="Hichem";
		inClassStudents[1]="Tetteh";
		System.out.println(inClassStudents[2]);

	}

}
