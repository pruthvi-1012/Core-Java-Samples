package h.wrapper;

public class Utility {
	
	
	public static void main(String args[]){
		
		
		// xxxValue()
		Integer i=new Integer(100);
		int i1=i.intValue();
		System.out.println("xxxValue()"+i1);	// Here we converted the wrapper class to int.
		
		//parseInt()
		
		int n=Integer.parseInt("1000");
		System.out.println("\nparseInt()::"+n);
		
		int n1=(int)Double.parseDouble("1000.001");
		System.out.println("\nparseInt()::::"+n1);
		
		// valueOf()
		Integer i2=Integer.valueOf("12000");
		System.out.println("\nvalueOf()::::::"+i2);
		
		//toString()
		
		String s=Integer.toString(254,16);
		System.out.println("\nString:::::::::"+s);
		
		//toxxxString()
		
		String s1=Integer.toOctalString(15);
		System.out.println("\nString:::::::::::"+s1);
	}

}
