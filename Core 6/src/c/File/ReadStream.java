package c.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadStream {
	
	public static void main(String args[]) throws IOException
	{
		File f=new File("D:/bike3.jpg");
		
		FileInputStream fis=new FileInputStream(f);
		
		byte[] b=new byte[100000];
		fis.read(b);
		fis.close();
		
		File file=new File("E:/new.jpg");
		
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(b);
		fos.close();
	}

}
