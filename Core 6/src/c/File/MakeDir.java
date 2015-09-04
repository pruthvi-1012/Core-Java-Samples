package c.File;

import java.io.File;
import java.io.IOException;

public class MakeDir {

	public static void main(String args[]) throws IOException{
		
		File f=new File("D:/New Folder/");
		f.mkdir();
		//f=new File("D:/New Folder/data.txt");
//		/f.createNewFile();
		
		File f2=new File(f,"MyData.txt");
		f2.createNewFile();
	}
}
