package e.staticExample;



	class E{
		/* 
		E(){
			System.out.println("E");
		}*/
		
		E(int n){
			
		}
	}

	class D extends E{
		
		{
			System.out.println("Intial Block");
		}
		
		static{
			System.out.println("Static Block");
		}
		
		D(){
			super(90);
			System.out.println("Constructor");
		}
		
		D(int  n){
			
			super(9);
			System.out.println("With argument");
		}
	}

public class Simple {
	
	public static void main(String args[]){
		
		D d=new D(6);
	}

}
