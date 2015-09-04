package c.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderClass {
	
	public static void main(String args[]) throws IOException{
		
		File f=new File("D:/myfile.txt");
		char b[]=new char[50];
		FileReader fr=new FileReader(f);
		int n=fr.read(b);
	
		for(int i=0;i<n;i++){
			System.out.print(b[i]);
		}
		
	}

}
