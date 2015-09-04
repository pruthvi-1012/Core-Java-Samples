package i.garbagecollection;

public class MainClass {
	
	public static void main(String args[]){
		Runtime r=Runtime.getRuntime();
		System.out.println("Total JVM memory:::"+r.totalMemory());
		System.out.println("Total Free Memory:::"+r.freeMemory());
		
		Student s=new Student();
		Student s2=new Student();
		
		System.out.println("\nAfter Assiging Object");
		System.out.println("Total Free Memory:::"+r.freeMemory());
		
		s=null;
		s2=null;
		
		System.out.println("\nAfter Pointing to null ");
		System.out.println("Total Free Memory:::"+r.freeMemory());
		
		System.gc();
		
		System.out.println("\nAfter System.gc()");
		System.out.println("Total Free Memory:::"+r.freeMemory());
	}

}

class Student{
	
	int a[]=new int[1000];
	
	void display(){
		System.out.println("HIII");
	}
}