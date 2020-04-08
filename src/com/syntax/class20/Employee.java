package com.syntax.class20;

public class Employee {
	static String company;
	int empNumber;
	double salary;
	
	void getPaid() {
		System.out.println("Employee gets "+salary);
	}

	static void work() {
		System.out.println("Employee works for "+company);
	}
}
	class ScrumTeam extends Employee{
		String ceremonies;
		void attendMeetings() {
			System.out.println("Scrum team attends "+ceremonies);
		}
	}
	class ProductOwner extends ScrumTeam{
		void prioritizeBacklog() {
			System.out.println("Product owner prioritize Backlog");
		}
	}
	class ScrumMaster extends ScrumTeam{
		void navigateTeam() {
			System.out.println("Scrum master navigates team");
		}
	}
	class Tester extends ScrumTeam{
		void coding() {
			System.out.println("Tester test the codes");
		}
	}


