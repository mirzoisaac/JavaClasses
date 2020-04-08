package com.syntax.class20;

public class Doctor {
	int doctorId;
	String name;
	public Doctor() {
		System.out.println("Empty constuctor");
	}

	public Doctor(String name, int doctorId) {
		this.name = name;
		this.doctorId = doctorId;
		System.out.println("Doctor class");
	}
}

class Dentist extends Doctor {
	String name;
	Dentist(){
		System.out.println("Dentist empty constructor");
	}
	
	Dentist(String name, int doctorId) {
		// compiler will try to make call to parent class constructor super();
		super(name, doctorId);
		System.out.println("Dentist Class");
		System.out.println(super.name+" "+super.doctorId);
	}
	

}
