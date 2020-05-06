package akaiIlhom;

public class MethodsTest {

	public static void main(String[] args) {
		Methods obj= new Methods();
		obj.method2("Ilhom");
		obj.method3();
	    
//		String str=Methods.method4();
//		System.out.println(str);
		System.out.println(Methods.method4());
		//System.out.println(obj.method5());
		
		int [] a= obj.method5();// array of int[] in
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		
	
		
	

	
   
		
		

	}

}
