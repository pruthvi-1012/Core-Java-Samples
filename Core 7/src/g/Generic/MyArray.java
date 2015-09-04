package g.Generic;


	class Parent{
		
	}
	
	class Child extends Parent{
		
	}

public class MyArray {

	public static void main(String args[]){
	
		Parent[] p =new Parent[2];
		p[0]=new Parent();
		p[1]=new Child();
		
		Child[] c =new Child[2];
		c[0]=new Child();
		c[1]=new Child();
		
		addAll(c);
		addAll(p);
		
	}
	
	public static void addAll(Parent[] p){
		
		p[0]=new Child();
	}
}
