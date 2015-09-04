package i.garbagecollection;

public class IslandDemo {
	
	public static void main(String args[]){
		
		Runtime r=Runtime.getRuntime();
		
		System.out.println("Total JVM memory:::"+r.totalMemory());
		System.out.println("Total Free Memory:::"+r.freeMemory());
										
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		

		System.out.println("\nAfter Assiging Object");
		System.out.println("Total Free Memory:::"+r.freeMemory());
		
		e1.e=e2;
		e2.e=e3;
		e3.e=e1;
		
		e1=null;
		e2=null;
		e3=null;
		
		System.out.println("\nAfter Pointing to null ");
		System.out.println("Total Free Memory:::"+r.freeMemory());
		
		System.gc();
		
		System.out.println("\nAfter System.gc()");
		System.out.println("Total Free Memory:::"+r.freeMemory());
		
	}

}

class Employee{
	
	Employee e;
}
