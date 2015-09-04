package e.trycatch;

public class Demo {

	public static void main(String args[]){
		
	try{
		int a=10;
		int b=a/0;
	} 
	//System.out.println("Hi");
	finally{
		
	try{
		
		System.out.println("Final Block"+(12/0));
		
	}catch(Exception r){
		
		System.out.println("Not Possible");
		
		}
	}
	
			
		
	}
}
