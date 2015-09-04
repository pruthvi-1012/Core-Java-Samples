package b.OverridetoString;

public class Demo {

	public static void main(String args[]){
		
		Vehicle v=new Vehicle(4,"Car");
		System.out.println(v.toString());
		
	}
}


	class Vehicle{
		int wheels;
		String name;
		
		Vehicle(int wheels,String name){
			this.wheels=wheels;
			this.name=name;
		}
		
		public String toString(){
			return "Name=="+name+"  Wheels=="+wheels;
		}
	}