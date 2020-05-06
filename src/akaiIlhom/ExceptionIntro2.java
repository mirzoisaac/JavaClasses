package akaiIlhom;

public class ExceptionIntro2 {

	public static void main(String[] args) {
		
		
		int i[]= {1,2,3,4,5,6};
		i[0]=1;
		
		
		try {
		System.out.println(i[5]);
		Thread.sleep(5000);
		}catch(RuntimeException e) {
			System.out.println("Ilhom Exception");
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(i[0]);
		System.out.println("ahahahahah");
		
		
		
		
		
		
		
		

	}

}
