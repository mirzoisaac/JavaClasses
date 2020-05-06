package akaiIlhom;

public class Methods {
	
	private static void method1() {
		System.out.println("method type is VOID");
	}
	
	public final void method2(String str) {
		System.out.println("Access Modifier is PUBLIC, Non- access modifier is FINAL, Type is VOID with String Parameter");
	}
	
	protected static void method3() {
		System.out.println("Simple VOID method");
	}
	
	public static String method4() {
		String str="Ilhom";
		
		if(str.contains("o")) {
			str="Ilhom Virginia";
		}else {
			str="Ilhom Maryland";
		}
		
		
		return str;
		
	}
	
	 public int[] method5() {
		 int [] in= new int[5];
		 
		 for(int i=0; i<5; i++) {
			 in[i]=i;
			 //01234--> 5 elements
		 }
		 
		return in;	 
	 }
	 
	 
	 
	
	

}
