package d.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

	class Vehicle {
		
		Vehicle(){
			System.out.println("Vehicle Constructor");
		}
		
	}
	
	class FourWheeler extends Vehicle{
			FourWheeler(){
				System.out.println("FourWheeler Constructor");
			}
	}
	
	class Car extends FourWheeler  implements Serializable {
		String name;
		int speed;
		
		Car(){
			System.out.println("Car Constructor");
		}
	}

public class MyClass {

	public static void main(String args[]) throws IOException, ClassNotFoundException{
		
		Car c=new Car();
		System.out.println();
		c.speed=250;
		c.name="Ferrari";
		
		System.out.println("Before Serialization:");
		System.out.println("SPEED=="+c.speed+" Name=="+c.name);
		FileOutputStream fos=new FileOutputStream("d:/serialization.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.close();
		
		
		System.out.println();
		// Read an Object's status
		FileInputStream fis=new FileInputStream("d:/serialization.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Car c2;
		c2=(Car)ois.readObject();
		
		System.out.println();
		
		ois.close();
		
		System.out.println("After Serialization:");
		System.out.println("SPEED=="+c2.speed+" Name=="+c2.name);
		
	}
}
