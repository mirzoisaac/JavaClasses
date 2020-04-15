package com.syntax.class25;

public abstract class Marks {
//	We have to calculate the average of marks obtained in three subjects by student A and by student B.
//	Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks.
//	Provide implementation of abstract method in classes ‘A’ and ‘B’. 
//	The constructor of student A takes the marks in three subjects as its parameters and the marks
//	in four subjects as its parameters for student B. 
//	Test your code
	abstract int getPercentage();
	int bio, math, chem, geom;
	Marks(int bio, int math, int chem){
		this.bio=bio;
		this.math=math;
		this.chem=chem;
	}
	Marks(int bio, int math, int chem, int geom){
		this(bio, math,chem);
		this.geom=geom;
//		this.bio=bio;
//		this.math=math;
//		this.chem=chem;
//		this.geom=geom;
	}
	

}
class A extends Marks{
	A(int bio, int math, int chem){
		super(bio, math, chem);
	}

	@Override
	int getPercentage() {
		int perc=(bio+math+chem)/3;
		
		return perc;
	}
}
class B extends Marks{
     B(int bio, int math, int chem, int geom){
		super(bio,math,chem,geom);
	}

	@Override
	int getPercentage() {
		int perc=(bio+math+chem+geom)/4;
		
		return perc;
	}
}