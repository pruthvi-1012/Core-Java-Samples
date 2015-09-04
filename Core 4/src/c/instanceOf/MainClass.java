package c.instanceOf;
	
class C{
	
}

class B extends C {
	
}

class A extends B{ 
	
}

public class MainClass extends A {
	
	public static void main(String args[]){
		
		/*A a=new MainClass();
		A a1=new A();
		B b=new A();
		C c=new A();
		MainClass mc=new   MainClass();*/
		
		A a1=new A();
		
		C c1=new B();
		
		if(c1 instanceof B ){
			System.out.println("True");
		}else{
			System.out.println("False");
			}
		
	}

}
