package d.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


		class Animal implements Serializable{
		
	}

public class MainClass {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		
		
		Animal a=new Animal();
		
		// Write Object Status
		FileOutputStream fos=new FileOutputStream("d:/serialization.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.close();	
		
		// Read Object Status
		FileInputStream fis=new FileInputStream("d:/serialization.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		a=(Animal)ois.readObject();
		ois.close();
		
	}

}
