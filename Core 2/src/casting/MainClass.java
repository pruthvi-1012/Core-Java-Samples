package casting;

	class Parent{
		
		void parent(){
			System.out.println("Parent");
		}
		
		void display(){
			System.out.println("Parent Display");
		}
	}
	
	class Child extends Parent{
		
		void display(){
			System.out.println("Child Display");
		}
		
		void child(){
			System.out.println("Child");
		}
	}

	public class MainClass {
	
		public static void main(String args[]){
		
		
		System.out.println("Parent p=new Parent()");
		Parent p=new Parent(); // By using this instance variable 
		p.display();			//only Parent class's methods will be visible.
		p.parent();
		System.out.println("\n \n");
		
		System.out.println("Child p=new Child() ");
		Child c=new Child();   // By using this instance variable 
								//only Child class's methods will be visible.
		c.parent();
		c.display();
		c.child();
		System.out.println("\n \n");
		
		
		System.out.println("Parent p1=new Child() ");
		Parent p1=new Child();
		
		p1.parent(); // This is parent class's Method.
		p1.display();// This is overrided method of Child class.
		System.out.println("\n \n");
		
		
		System.out.println("Downcasting :::");
		Child c1=(Child) p1;
		
		c1.parent();
		c1.display();
		c1.child();
	}

}
