package a.inner;

	
	class Outer{
		
		private int x=10;
		
		class Inner{
		
			public void display(){
				System.out.println(x);
			}
			
		}
	}

public class MainClass {

	public static void main(String args[]){
		
		Outer.Inner i=new Outer().new Inner();
		i.display();
		
	}
}
