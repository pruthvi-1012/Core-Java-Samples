package d.argumentClass;


	interface I{
		
		public void print();
		
	}

	class Outer{
		
		public void display(I i){
			i.print();
		}
	}

public class MainClass {

	public static void main(String args[]){
		
		Outer o=new Outer();
		o.display(new I(){ public void print(){System.out.println("Method");} });
		
	}
}
