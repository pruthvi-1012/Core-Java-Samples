package c.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterClass {
	
	public static void main(String args[]) throws IOException{

		File f=new File("D:/myfile.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Hi How Are You?");
		fw.write("good morning");
		fw.append("Bye");
		
		
		PrintWriter pw=new PrintWriter(fw);
		pw.println("Hi How Are you?");
		pw.println("Good Morning");
		pw.println("Fine");
		
		fw.flush();
		fw.close();
	}

}
