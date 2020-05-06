package akaiIlhom;

//extends= inheritance of classes
//implements= implementation(completion) of abstract classes

interface Virginia {
	void fairfax();//-25%

}
interface Maryland{
	 void princeGeorge();//-25%
}
interface DC extends Virginia, Maryland{
	
	void  washington();//-25%
	void whiteHouse();//-25%
}
abstract class DMV implements DC{

	@Override
	public void fairfax() {//25%
		
	}

	@Override
	public void princeGeorge() {//25%
		
		
	}
}
 class DMVArea extends DMV implements DC{

	@Override
	public void washington() {//25%
		
		
	}

	@Override
	public void whiteHouse() {//25%
		
		
	}
	 
 }
