package d.constructor;

	class A{
		
		String name;
		A(){
			this("A");
		}
		
		A(String name){
		//	this();
			this.name=name;
			System.out.println(name);
		}
	}

public class Main {
	
	public static void main(String args[]){
		
		A a=new A();
		
		
	}

}
