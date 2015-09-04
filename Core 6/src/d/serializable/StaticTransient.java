package d.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StaticTransient {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{


		Parent p=new Parent();
		p.age=45;
		p.weight=65;
		
		System.out.println("Before Serialization:");
		System.out.println("Age=="+p.age+" Weight=="+p.weight);
		FileOutputStream fos=new FileOutputStream("d:/serialization.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		
		p.age++;
		p.weight++;
		
		System.out.println();
		// Read an Object's status
		FileInputStream fis=new FileInputStream("d:/serialization.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Parent p2;
		p2=(Parent)ois.readObject();
		ois.close();
		
		System.out.println("After Serialization:");
		System.out.println("Age=="+p2.age+" Weight=="+p2.weight);
		
		
	}

}

	class Parent implements Serializable{
		volatile int weight;
	   	int age;
	}
