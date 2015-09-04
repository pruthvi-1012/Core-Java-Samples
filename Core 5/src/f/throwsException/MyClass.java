package f.throwsException;

import java.io.IOException;

public class MyClass {

	public static void main(String args[]) {
		
		output();
		
		
	}
	
	public static void output() {
		try {
			display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void display() throws IOException{
		throw new IOException();
	}
}
