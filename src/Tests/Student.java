package Tests;

public class Student {
	int studentId;
	  String name, lastName;
	  
	  public Student(int studentId, String name, String lastName){
	    this.studentId=studentId;
	    this.name=name;
	    this.lastName=lastName;
	    
	  }
	  
	  public void display(){
	    System.out.println("Student detail: "+name+" "+lastName+" with id: "+studentId);
	  }
	  

}
