package b.access;


	 class Parent
	 
	{
		
		public void output()
		{
			System.out.println("Inside Parent Class");
		}
		
	}

	
	// By extending Parent Class...
	
public class Demo2 extends Parent{
	
	public static void main(String args[])
	{
		
	}

	public void display()
	{
		output();
	}
}
