package com.syntax.class28;



public class Food1 {
	
		
		String food;
		public Food1(String food) {
			this.food=food;
		}
		
		public void cal() {
			
		}
		public  void pro() {
			
		}
		public  void car() {
			
		}

	}
	class Oatmeal extends Food1{
		
		Oatmeal(String food){
			super(food);
		}

		@Override
		public void cal() {
			System.out.println(food+" has less calories");
			
		}

		@Override
		public void pro() {
			System.out.println(food+" has medium protein");
			
		}

		@Override
		public void car() {
			System.out.println(food+" has little carbohydrates");
			
		}
		
	}
	class Chicken extends Food1{

		public Chicken(String food) {
			super(food);
			
		}

		@Override
		public void cal() {
			System.out.println(food+" has less calories");
		}

		@Override
		public void pro() {
			System.out.println(food+" has less proteins");
			
		}

		@Override
		public void car() {
			System.out.println(food+" has less carbohydrates");
			
		}
		
	}
	class Yogurt extends Food1{

		public Yogurt(String food) {
			super(food);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void cal() {
			System.out.println(food+" has less calories 3");
			
		}

		@Override
		public void pro() {
			System.out.println(food+" has more proteins 3");
			
		}

		@Override
		public void car() {
			System.out.println(food+" has less carbohydrates 3");
			
		}
		

}
