package g.Generic;

import java.util.ArrayList;
import java.util.List;



	class Vehicle{
		
	}
	
	class Car extends Vehicle{
		
	}
	
	
public class MyGenerics {

	public static void main(String args[]){
	
		List<Vehicle> l=new ArrayList<Vehicle>();
		l.add(new Car());
		l.add(new Vehicle());
		addAll(l);
		
		List<Car> c=new ArrayList<Car>();
		c.add(new Car());
		addSubType(c);
		
	}
	
	public static void addAll(List<Vehicle> l){
		l.add(new Car());
	}
	
	public static void addSubType(List<? extends Vehicle> l){
//		/l.add(new Car());
	}
}
