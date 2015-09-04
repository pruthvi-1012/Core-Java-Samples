package e.trycatch;

public class MainClass {
	
	public static void main(String args[]){
		int a=10;
	try{
		
		int b=a/0;
		System.out.println(b);
	}catch(Exception e){
		try{
			System.out.println("Not Possible"+(a/0));
		}catch(Exception e1){
			System.out.println("Not Possible-1");
		}
		}/*catch(ArithmeticException e){
			System.out.println("Exception Here");
		}*/
		
	}
}
