package c.interfaces;

	interface Car{
		
	int i=100;
	}

public class Demo3 implements Car{
	
	Car c1=new Demo3();
	 
	public static void main(String args[]){
		
		System.out.println(Car.i);
		
	}

}
