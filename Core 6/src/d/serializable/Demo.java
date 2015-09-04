package d.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

	class Shape {
		
		
	}
	
	class Circle implements Serializable{
		
	// transient Shape s;
		Shape s; // RuntimeError Here
		
		Circle(Shape s1){
			
			s=s1;
		}
		
	}
public class Demo {

	public static void main(String args[]) throws IOException, ClassNotFoundException{
		
		Shape s1=new Shape();
		Circle c=new Circle(s1);
		FileOutputStream fos=new FileOutputStream("d:/serialization.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.close();	
		
		// Read Object Status
		
		
		FileInputStream fis=new FileInputStream("d:/serialization.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		c=(Circle)ois.readObject();
		ois.close();
		
	}
}
