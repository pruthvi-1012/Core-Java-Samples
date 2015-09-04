package c.interfaces;


	interface I4{
		
		public void display();
	}

	abstract class Vehicle implements I4 {
		
		
		abstract public void goFast();
		abstract public void accelerate();
		
		
	}

public class Demo2 extends Vehicle implements I4{
	
	public static void main(String args[]){
		
		Demo2 d=new Demo2();
		d.accelerate();
		d.goFast();
		d.display();
				
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("accelerate");
		
	}

	@Override
	public void goFast() {
		// TODO Auto-generated method stub
		System.out.println("Fast");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display");
	}

}
