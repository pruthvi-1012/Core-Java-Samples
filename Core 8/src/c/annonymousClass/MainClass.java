package c.annonymousClass;


	class Vehicle{
		
		public void speed(){
			
			System.out.println("Speed Vehicle");
			
		}
		
		public void accelerate(){
			
			System.out.println("Accelerate Vehicle");
		}
		
	}
	
	
	class Car{
		
		Vehicle v=new Vehicle(){
			
		public void speed(){
			
			System.out.println("Speed Car");
			
			}
		
		
		};
		
	}


public class MainClass {

	
	
	public static void main(String args[]){
		
		
		Car c=new Car();
		c.v.speed();
	}
	
}
