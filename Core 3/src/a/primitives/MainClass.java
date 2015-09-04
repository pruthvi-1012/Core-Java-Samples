package a.primitives;

public class MainClass {
	
	public static void main(String args[]){
		
		// Integer Primitives
		System.out.println("Integer");
		int a=10;
		
		int b=010;
		
		int c=011;
		
		int d=0x0001;
		
		int e=0x000f;
		
		System.out.println("a:"+a+" b:"+b+" c:"+c+" d:"+" e:"+e+"\n");
		
		// Character Primitives
		
		System.out.println("Character");
		char a1='a';
		
		int z=a1;
		
		char b1=98;
		
		char c1=(char)55;
		
		char d1='\\';
		
		char e1='\u0000';
		
		System.out.println("a1::"+a1+"\n"+"ASCII VALUE IS:"+z);
		
		System.out.println("b1::"+b1);
		System.out.println("c1::"+c1);
		System.out.println("d1::"+d1+"\n");
		System.out.println("e1::"+e1+"\n");
		
		System.out.println("Byte");
		
		byte a2=12;
		byte b2= 5;
		byte c2=(byte) 129; // the 129 is out of range of byte type.
							// So we have to cast it into byte
		
		byte d2=(byte)(a2+b2);
		System.out.println("a2::"+a2+"\n b2::"+b2+"\n c2::"+c2+"\n d2::"+d2);
		
		// Long 
		
		long l=20090909090909L;
		System.out.println("\n Long\n l="+l);
		
		// float
		
		float o=134.44578899432211F;
		System.out.println("\n float\n o="+o);
		
		// Double
		double y=1234.23543456;
		System.out.println("\n Double \n d="+y);
	
	}						

}

