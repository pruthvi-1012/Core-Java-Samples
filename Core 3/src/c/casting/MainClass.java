package c.casting;

public class MainClass {
	
	
	public static void main(String args[]){
		
		int a=(int)100.01012346767893;
		System.out.println(a);
		
		byte b= (byte)129;
		System.out.println(b);
		
		byte c=7;
		c=+7;			// This is OK.
		
		c=(byte)(c+7); // If I remove casting '(byte)' then it will show an error.
					   // becz c+7 indicates an integer so we have to cast it.
		
		long l=100000000000l;
		
		display((int)l);
		
		int i=1000;
		
		display(i);
		
	}
	
	static void display(int n){
		System.out.println("Integer");
	}
	
	static void display(long n){
		System.out.println("Long");
	}

}
