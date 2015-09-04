package f.throwsException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
	
	public static void main(String args[]) throws Exception{
	
		display();
	}
	
	public static void display() throws IOException{
		
		int a=10;
		throw new IOException();
	
	}

}
