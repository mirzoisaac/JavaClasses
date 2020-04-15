package com.syntax.class26;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor doc=new Doctor();
		doc.setEmail("");
		doc.setEmail("shokl@gmail.com");
		System.out.println(doc.getEmail());
		doc.setLicenseID(463637290);
		System.out.println(doc.getLicenseID());

	}

}
