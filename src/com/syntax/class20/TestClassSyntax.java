package com.syntax.class20;

public class TestClassSyntax {
	
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.empNumber=411;
		obj.salary=100000;
		obj.company="Syntax Technologies";
		obj.getPaid();
		obj.work();	
         ScrumTeam obj1=new ScrumTeam();
	     obj1.empNumber=412;
				
         ProductOwner obj2= new ProductOwner();
         obj2.empNumber=423;
         obj2.salary=90000;
         obj2.company="ICQ";
         obj2.getPaid();
         obj.work();
         Tester obj3=new Tester();
         obj3.empNumber=414;
         obj3.salary=80000;
         obj3.ceremonies="StandUp meeting";
         obj3.attendMeetings();
         obj3.coding();
	
	}
}
