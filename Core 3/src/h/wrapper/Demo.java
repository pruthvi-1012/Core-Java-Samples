package h.wrapper;

public class Demo {
	
	public static void main(String args[]){
		Integer i=new Integer(10);
		print(10);
		short s1=10;
		Short s=new Short(s1);
		print(s);
	
	}
	
	static void print(int n){
		System.out.println("int");
	}
	
	/*static void print(Integer n){
		System.out.println("Integer wrapper class");
	}
	
	static void print(int...n){
		System.out.println("Var args");
	}
	
	static void print(short n){
		System.out.println("short primitive");
	}*/
}
