package d.constructor;

	class C{
		
		int a;
				
		C(){
			System.out.println("Constructor");
		}
		
		C(String name,int a){
			
		}
		
		void C(){
			System.out.println("Method");
		}
	}

public class Simple {

		public static void main(String args[]){
			C c=new C("a",1);
		
		}
}
