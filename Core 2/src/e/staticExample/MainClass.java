package e.staticExample;

	class C{
		
		String name;
		static int count;
	}

public class MainClass {
	
	public static void main(String args[]){
		
		C c1=new C();
		c1.name="ABC";
		c1.count=100;
		System.out.println(c1.name+"  "+c1.count);
		System.out.println();
		
		C c2=new C();
		c2.name="XYZ";
		c2.count=300;
		System.out.println(c2.name+"  "+c2.count);
		System.out.println();
		
		System.out.println(c1.name+"  "+c1.count);
		
	}

}
