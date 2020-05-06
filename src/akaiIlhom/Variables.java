package akaiIlhom;

public class Variables {
	
	public  String str;
	//private
	//protector
	//default
	//public
	int i;
	
	public Variables(String str) {
		this.str=str;
	}
	public Variables(String str, int a){
		this(str);
	}
	
	
	public void display() {
		System.out.println("Display method"+ str);
		
	}

	public void verifyID(int a) {
		
		//code specific verification
		System.out.println("Verify ID of class Veriables with 1 parameter");
	}
    public void verifyID(int a, int b) {
		//this.verifyID(a);
		System.out.println("Verify ID of class Veriables with 2 parameters");
		//2 way code specific verification
		
		
	}
}
class Overriding extends Variables{

	public Overriding(String str) {
		super(str);
	}
	
	@Override
	public void verifyID(int a) {
		//different class code specific verification
		System.out.println("Verify ID of class Overriding with 1 parameter");
		
	}
	public void verifyID(String a, int b) {
	
	}
	
	
	
	
}
