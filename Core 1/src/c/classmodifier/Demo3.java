package c.classmodifier;

abstract class Car{
	
	public int avg;
	public int price;
	public int year;
	
	public abstract void goFast();
	public abstract void accelerate();
	
}
											


public class Demo3 extends Car{

	@Override
	public void accelerate() {
		
		
	}

	@Override
	public void goFast() {
	
		
	}

	public static void  main(String args[]){
		
		// Car c=new Car(); // You can't create an object of Abstract class...
		
	}
	
}
