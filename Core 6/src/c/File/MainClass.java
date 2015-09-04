package c.File;

import java.io.File;
import java.io.IOException;

public class MainClass {
	
	public static void main(String args[]) throws IOException{
		
		File f=new File("D:/file1.txt");
		System.out.println(f.createNewFile());
		
	}

}
