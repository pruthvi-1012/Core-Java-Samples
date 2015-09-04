package c.interfaces;


	interface I2{
		
		public void display();
		public void output();
	}
	
	interface I3 extends I2{
		
		public void print();
	}

public class Demo1 implements I2,I3{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
