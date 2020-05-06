package akaiIlhom;

public class VariablesTest {

	public static void main(String[] args) {
		
	Variables obj= new Variables("Ilhom", 100);
		obj.verifyID(10);
		obj.verifyID(10, 20);
		
		Variables obj2= new Overriding("World");
		obj2.verifyID(30);
		obj2.verifyID(10, 20);

		
	}

}
