package akaiIlhom;

public abstract class AbstractClassParent {
	
	 String str;
	 int i;
	
	abstract public void method();// no body -50%
	abstract int number();// no body -50%

}
abstract class AbstractClassChild extends AbstractClassParent{
	
	public void method() { //50%
		System.out.println("Hello");
	}
	
	abstract int number();//-50%
	
}

class Operation extends AbstractClassChild{
	
	int number() { //50%
		int a=100;
		
		return a;
	}
	//100%
}

