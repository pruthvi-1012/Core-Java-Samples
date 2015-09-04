package b.methodlocalinner;



	class Outer{
		
		
		private static int x;
		
		public static void display(){
			
			class Inner{
				
					public void output(){
						
						System.out.println(x);
						
					}
					
					
										
			}
			
			new Inner().output();
		}
	}

public class MainClass {

	public static void main(String args[]){
		
		
		Outer o=new Outer();
		o.display();
	}
}
