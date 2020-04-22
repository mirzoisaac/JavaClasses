package Tests;

public class Person {
	 private String firstname, lastname, ssn;
	  int birthmonth, birthday,birthyear;
	  
	  Person(String firstname, String lastname, String ssn, int birthmonth, int birhtday, int birthyear){
	    this.firstname=firstname;
	    this.lastname=lastname;
	    this.ssn=ssn;
	    this.birthmonth=birthmonth;
	    this.birthday=birhtday;
	    this.birthyear=birthyear;
	  }
	  
	  public String formatBirthday(){
	    String format;
	    format=birthmonth+"/"+birthday+"/"+birthyear;
	    return format;
	  }
	  public String getFristname(){
	    return firstname;
	  }
	  public String getLastname(){
	    return lastname;
	  }
	  public String getSsn(){
	    return ssn;
	  }
	  
	  
	  
	  

}
