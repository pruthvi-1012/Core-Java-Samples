package d.constructor;
	
	
	class Parent{
	
		Parent(String name){
			System.out.println("Parent Constructor::No argument");
		}
		
	}
	
	class Child extends Parent{
		
		Child(){
			super(null);
			System.out.println("Child Constructor:: No argument");
		}
		
		Child(String name){
			super(null);
			System.out.println("Child Constructor::One argument");
		}
		
	}

	
public class InheritConst {
	
	public static void main(String args[]){
		//new Child();
		new Child("Kush");
	}

}
