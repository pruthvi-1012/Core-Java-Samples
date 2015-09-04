package f.throwsException;

public class Demo {
	
	public static void main(String args[])throws RuntimeException{
		
	try{
		int a=10;
		int b=a/0;
		System.out.println(b);
	} catch(Exception e){
		System.out.println("Not possible");
	} finally{
		System.out.println("Finally Closed");
	   }
	}

}
