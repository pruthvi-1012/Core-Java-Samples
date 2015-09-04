package a.override;

	class Vehicle{
		
		 void goFast(){			
			System.out.println("Fast");			
		}
		 
		/* void display(){
			 System.out.println("Vehicle");
		 }*/
		 
	}

public class Car extends Vehicle{
	
	int c=0;
	
	public static void main(String args[]){
		
		//Vehicle v=new Vehicle();
		//Car c=new Car();
		Vehicle v=new Car();
		v.goFast();
		//v.display();
			
	}
	
		
	 void goFast(){
		System.out.println("Override Method");			
	}
	
	/*void output(){
		 System.out.println("CAR");
	 }*/
}
