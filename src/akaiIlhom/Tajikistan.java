package akaiIlhom;
      
    

public class Tajikistan {
	 public String region, area;
	 public int num;
	 
	 public Tajikistan(String region,String area, int num) {
		 this.region=region;
		 this.area=area;
		 this.num=num;
	 }
	 
	 public void province() {
		 System.out.println(region+" province is in the " +area+ " and has"+num+" regions");
	 }
	 
	 public void water() {
		 System.out.println(region+" has enough water for everyone");
	 }
	
	

}
